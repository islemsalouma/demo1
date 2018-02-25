 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="formCat">
<form action="enregistrer" method ="get">
  
  Nom de la Categorie:<br>
  <input type="text" name="nomCategorie"><br>
  
  Description:<br>
  <input type="text" name="description"><br>
  
  <input type="submit" value="Submit">
</form>
<%-- <a href="<c:url value="/j_spring_security_logout" />" >
Logout</a> --%>
</div>
<table>
<tr>
<th>ID</th><th>NOM CAT</th><th>DESCRIPTION</th>
</tr>
<c:forEach items="${categories}" var="cat">
<tr>
<td>${cat.getIdCategorie()}</td>
<td>${cat.getNomCategorie()}</td>
<td>${cat.getDescription()}</td>
<td><a href="suppcat/${cat.getIdCategorie()}">Supprimer</a></td>
<%-- <td><a href="editCat?idCat=${cat.getIdCategorie()}">Edit</a></td>
 --%></tr>
</c:forEach>
</table>
</div> 