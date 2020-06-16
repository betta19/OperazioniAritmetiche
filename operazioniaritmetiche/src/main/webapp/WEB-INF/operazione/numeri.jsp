<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test = "${scelta == 'Addizione'}">
         <c:set var = "operazione" value = "addizione"/>
      </c:if>
      <c:if test = "${scelta == 'Sottrazione'}">
         <c:set var = "operazione" value = "sottrazione"/>
      </c:if>
      <c:if test = "${scelta == 'Divisione'}">
         <c:set var = "operazione" value = "divisione"/>
      </c:if>
      <c:if test = "${scelta == 'Moltiplicazione'}">
         <c:set var = "operazione" value = "moltiplicazione"/>
      </c:if>
<form action="scelta" method="post">
		<input type="number" name="primoNumero" placeholder="Inserisci il primo numero">
		<input type="number" name="secondoNumero" placeholder="Inserisci il secondo numero">
		<input type="submit" value="Calcola!">
		
		
	</form>
</body>
</html>