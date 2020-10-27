<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page  import="com.sap.persistence.j.*" %>
    <%@page import="REST.*" %>
    <%@page import="zwo.*" %>
       <%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
 </head>
<body>

 <center> 
<form action="#" methode="get" >
<p>Datum der Fahrt eingeben</p>
 <input type="text" placeholder="DATUM EINGEBEN........"  name="tag"  >
<br>
<br>
<input type="submit" value="getFahtr"> 




</form>
</center>




<%
    String datum = request.getParameter("tag");
      
if(datum!=null){
   int date =Integer.parseInt(datum);

   PrintWriter printWriter=response.getWriter();

TaxidatenImplService s = new TaxidatenImplService();
Taxidaten p = s.getTaxidatenImplPort();
TaxikostenInterface k = new TaxikostenInterface();

Jc Cservice = new Jc();
Jcus Cport = Cservice.getJcusPort();

 
for (Taxifahrt obj : p.getDatum(date)) {
		//Taxifahrt obj = t.getDatum(date);
		int customer_id = obj.getKnr();
		int kilometer_d = obj.getEntfernung();
		k.setJSON(kilometer_d);
 	 

 	 
		 
 		printWriter.print("<br>"); 
 		
 		out.print("<table>");
		out.print("<thead>");
		out.print("<tr>");
		out.print("<th>" +"Datum"+"</th>");
		out.print("<th>" +"Kundennummer"+"</th>");
		out.print("<th>" +"Von"+"</th>");
		out.print("<th>" +"Nach"+"</th>");
		out.print("<th>" +"Entfernung"+"</th>");
		out.print("<th>" +"NameKunde"+"</th>");
		out.print("<th>" +"Country"+"</th>");
		out.print("<th>" +"Adresse"+"</th>");
		out.print("</tr>");
		out.print("</thead>");
		
		 

		out.print("<tbody>");

		 


		out.print("<tr>");

		out.print("<td>" + obj.getDatum() + "</td>" + "<td> "
				+ obj.getKnr() + "</td>" + "<td>" + obj.getVon() + "</td>" + "<td>" + obj.getNach()
				+ "</td>" + "<td>" + obj.getEntfernung()+"</td>");


			for (Customer c : Cport.findCUSTOMERByCusId(customer_id)) {

			out.print("<td>" + c.getName() + "</td>" + "<td>" + c.getCountry()
					+ "</td>" + "<td>" + c.getAddress()+"</td>");
			out.print("</tr>");
			out.print("<tr>");
			out.print("<th>"+"Rechnung"+"</th>");
		out.print(	"<td>"+k.getJSON()+"</td>");
	 

		out.print("</tr>");

			
			
			
			
			
			out.print("</tbody>");

			out.print("</table>");

			}}
 		 
		 
	}
%>

</body>
</html>