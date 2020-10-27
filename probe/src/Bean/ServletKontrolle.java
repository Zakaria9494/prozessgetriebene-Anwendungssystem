package Bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletKontrolle
 */
@WebServlet("/ServletKontrolle")
public class ServletKontrolle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletKontrolle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter print = response.getWriter();

		String frage = request.getParameter("one");
		String skala = request.getParameter("skala");

		 
 
		steuerklasse p = new steuerklasse();

		p.setFrage(frage);
 
		request.setAttribute("steuerklasse", p);

			
			double Npreis = Double.parseDouble(skala);
			p.setSkala(Npreis);;

 
		 
		print.print("  <center> <h1  style='color':#5fc1e8> Table der Mehrwertsteuer</h1></center>");
		print.println("<br>");
		print.print("<table border='1' width='40%' style='background:#f2f2f2'>");
		print.print(" <thead>");

		print.print(" <tr>");

		print.print(" <th> Steuertype </th>");
		print.print(" </tr>");
		print.print(" </thead>");
		print.print(" <tbody>");

		print.print(" <tr>");
		print.print(" <th> V Mehrwertsteuer =19% </th>");

		print.print(" <th> H Mehrwertsteuer =7% </th>");
		print.print(" <th> R Mehrwertsteuer =5% </th>");
		print.print(" </tr>");
		print.print(" </tbody>");

		print.print(" </table>");

		print.println("<br>");
		print.println("<table border='3' width='80%' style=background:#f2f2f2>");
		print.println("<thead>");
		print.println("<tr>");

		print.print(" <th>Steuertype</th>");
		print.print(" <th>Nettopreis</th>");
		print.print(" <th> Bruttopreis</th>");
		print.println("</tr>");
		print.println("</thead>");

		print.print(" </tbody>");
		print.print(" <tr>");

		print.print(" <th>" + request.getParameter("frage") + "</th>");
		print.print(" <th>" + request.getParameter("skala") + "</th>");
		print.print(" <th>" + p.Berechnung()+ "</th>");

		print.println("</tr>");

		print.print(" </tbody>");
		print.print(" </table>");
		print.println("</br>");

		print.println("</br>");
		print.println(
				"<center><a href='eingabe.html'><h2 style='color:5fc1e8'> Zurück zur Hauptseite</h2></a></center>");

		// RequestDispatcher dispatcher=request.getRequestDispatcher("ausgabe.jsp");
		// dispatcher.forward(request, response);

	}}
	 

