<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<div id="formCat">
	<f:form modelAttribute="categorie" action="/monapp/cat/save" method="get">

		<!--  id de la Categorie:<br> -->
		<f:input path="idCategorie" type="hidden" />
  
  
  Nom de la Categorie:<br>
		<f:input path="nomCategorie" />
		<br>
  
  Description:<br>
		<f:input path="description" />
		<br>

		<input type="submit" value="Submit">
	</f:form>
	<%-- <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>  --%>
</div>
<table>
	<tr>
		<th>ID</th>
		<th>NOM CAT</th>
		<th>DESCRIPTION</th>
	</tr>
	<c:forEach items="${categories}" var="cat">
		<tr>
			<td>${cat.getIdCategorie()}</td>
			<td>${cat.getNomCategorie()}</td>
			<td>${cat.getDescription()}</td>
			<td><a href="deleteCat/${cat.getIdCategorie()}">Supprimer</a></td>
			<td><a href="editCat/${cat.getIdCategorie()}">Edit</a></td>
		</tr>
	</c:forEach>
</table>
</div>
