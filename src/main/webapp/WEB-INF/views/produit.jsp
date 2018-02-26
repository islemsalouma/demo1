<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

	<f:form modelAttribute="produit" action="/monapp/prod/save" method="get">
	<!--  id du produite:<br> -->
  <f:input path="idProduit" type="hidden" />
	
  Designation<br>
  <f:input path="designation"/><br>
  
  Description:<br>
  <f:input path="description"/><br>
  
   prix<br>
  <f:input path="prix"/><br>

  quantité:<br>
  <f:input path="quantite"/><br>
  
  Catégorie<br>
  <f:select path="categorie.idCategorie" items="${categories}"
itemValue="idCategorie" itemLabel="nomCategorie"></f:select>

  <input type="submit" value="Submit">
</f:form>

<c:url var="logoutUrl" value="/logout"/>
<form action="${logoutUrl}" method="post">
    <input type="submit" value="Logout"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>


<table>
	<tr>
		<th>ID</th>
		<th>DESIGNATION</th>
		<th>DESCRIPTION</th>
		<th>PRIX</th>
		<th>QTE</th>
		<th>Categorie</th>
	</tr>
<c:forEach items="${produits}" var="prod">
	<tr>
		<td>${prod.getIdProduit()}</td>
		<td>${prod.getDesignation()}</td>
		<td>${prod.getDescription()}</td>
		<td>${prod.getPrix()}</td>
		<td>${prod.getQuantite()}</td>
		<td>${prod.getCategorie().getNomCategorie()}</td>
		<td><a href="deleteProd/${prod.getIdProduit()}">Supprimer</a></td>
		<td><a href="editProd/${prod.getIdProduit()}">Edit</a></td>
	</tr>
</c:forEach> 
</table>
