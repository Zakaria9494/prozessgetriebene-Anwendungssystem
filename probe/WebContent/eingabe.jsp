<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Bean.steuerklasse" %>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
</head>
<body>
   
   
     <jsp:useBean id="me" class="Bean.steuerklasse" scope="session"></jsp:useBean>
   
     <jsp:setProperty property="skala" name="me"  param="param1"/>

    <jsp:setProperty property="frage" name="me" param="param2"/>
   
	 
		<center>
			<h1>Mehrwertsteuerberechnung</h1>
			<br> <br>
			<form action="#" method="get">
			
			 
					
				
   <input type="text" name="id" value="Java"> Ist Ihre Unterhmen AGILE<BR>
    <input type="text" name="id" value=".NET"> .NET<BR>
    					
    					
    				
  <input type="radio" name="gender" > 1<br>
  <input type="radio" name="gender" > 2<br>
  <input type="radio" name="gender"> 3<br>
  
  
  					
					
					
					<br> <br>
				<button class="button" type="submit" value="Brechnen">Berechnen</button>
				<button class="button" type="reset" value="Reset">Delete</button>


			</form>
			
			
	</div>
	</center>
	<br>
	<br>
	  <center>  
	 <%if(request.getParameter("param2")!=null){ %>
	 
	 Mehrwersteuer:  <jsp:getProperty property="frage" name="me"/>
   <%} else{%>
   <a>Mehrwertsteuereingabe</a>
   <%} %>
     <br>
     
      	 <%if(request.getParameter("param1")==null){ %>
	  
	  	  <a>skala ..!!!</a>
	  
	 <%}else{ %>
	       
 	  Nettopreis:  <jsp:getProperty property="skala" name="me"/>
   <%} %>
     
     <br>
     
     Brutto: <% if(request.getParameter("param2")!=null && request.getParameter("param1")!=null){ %>
     
      <%} else{%>
     <a> Zur Bruttorechnung geben Sie die Mehrwertsteuer und Nettopreis ein !!!</a> <%} %>
     
      
  
 	
	</center>  
	
	
	  
</body>
</html>