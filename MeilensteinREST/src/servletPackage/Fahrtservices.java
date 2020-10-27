package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sap.persistence.j.Customer;
import com.sap.persistence.j.Jc;
import com.sap.persistence.j.Jcus;

import REST.TaxikostenInterface;
import zwo.Taxidaten;
import zwo.TaxidatenImplService;
import zwo.Taxifahrt;

/**
 * Servlet implementation class Fahrtservices
 */
@WebServlet("/Fahrtservices")
public class Fahrtservices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fahrtservices() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String datum = request.getParameter("tag");

		if (datum != null) {
			int date = Integer.parseInt(datum);

			PrintWriter printWriter = response.getWriter();

			TaxidatenImplService Tservice = new TaxidatenImplService();
			Taxidaten Tport = Tservice.getTaxidatenImplPort();
			TaxikostenInterface ti = new TaxikostenInterface();

			Jc Cservice = new Jc();
			Jcus Cport = Cservice.getJcusPort();

			for (Taxifahrt obj : Tport.getDatum(date)) {
				//Taxifahrt obj = t.getDatum(date);
				int customer_id = obj.getKnr();
				printWriter.print("<br>");

				printWriter.print("<br>" + "Datum der Fahrt: " + obj.getDatum() + "<br>" + "Kundennummer: "
						+ obj.getKnr() + "<br>" + "Von: " + obj.getVon() + "<br>" + "Nach :" + obj.getNach()
						+ "<br>" + "Entfernung: " + obj.getEntfernung());

				printWriter.print("<br>");

				printWriter.print("======KUNDEN DETAILS======");
				for (Customer c : Cport.findCUSTOMERByCusId(customer_id)) {
					printWriter.print("<br>");

					printWriter.print("Customername: " + c.getName() + "<br>" + "Country: " + c.getCountry()
							+ "<br>" + "Adresse" + c.getAddress());
					printWriter.print("<br>");

					
					int kilometer_d = obj.getEntfernung();
					ti.setJSON(kilometer_d);
					printWriter.print(ti.getJSON());
				}
			}}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
