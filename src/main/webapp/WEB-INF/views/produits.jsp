<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/monapp/produits/enregistrer" method ="get">
  Designation<br>
  <input type="text" name="Designation"><br>
  
  Description:<br>
  <input type="text" name="description"><br>
  
   prix<br>
  <input type="text" name="prix"><br>

  quantité:<br>
  <input type="text" name="quantité"><br>
  
  Categorie:<br>
  <input type="text" name="categorie"><br>
  <input type="submit" value="Submit">
</form>



<c:forEach items="${p}" var="pro">

<p>${pro.designation}</p> 

</c:forEach> 

</body>
</html> --%>