 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="formUser">
<form action="enregistrer" method ="get">
  
  Nom de l'utilisateur:<br>
  <input type="text" name="userName"><br>
  
  password:<br>
  <input type="password" name="passwrd"><br>
 
  
  <input type="submit" value="Submit">
</form>
<%-- <a href="<c:url value="/j_spring_security_logout" />" >
Logout</a> --%>
</div>
<table>
<tr>
<th>id</th><th>Nom de l'utilisateur </th><th> roles</th>
</tr>
<c:forEach items="${users}" var="u">
<tr>
<td>${u.getIdUser()}</td>
<td>${u.getUserName()}</td>
 <td>
 <c:forEach items="${u.getRoles()}" var="r">
 <td>${r.getRoleName()}</td>
 </c:forEach> 
 </td>
 <td><a href="suppuser/${u.getIdUser()}">Supprimer</a></td>
<%-- <td><a href="editCat?idCat=${cat.getIdCategorie()}">Edit</a></td>
 --%></tr>
</c:forEach>
</table>
</div> 