<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="registerUser">
	<f:form modelAttribute="user" action="/monapp/user/save" method="get">
		<!--  id du user:<br> -->
		<f:input path="idUser" type="hidden" />
		
		Nom de l'utilisateur:<br> 
		<input type="text" name="userName"><br> 
		password:<br> 
		 <input type="password" name="passwrd"><br>
		 
		 
		 <input type="submit" value="Submit">
	</f:form>
	<%-- <a href="<c:url value="/j_spring_security_logout" />" >
Logout</a> --%>
</div>
<table>
	<tr>
		<th>id</th>
		<th>Nom de l'utilisateur</th>
		<th>roles</th>
	</tr>
	<c:forEach items="${users}" var="u">
		<tr>
			<td>${u.getIdUser()}</td>
			<td>${u.getUserName()}</td>
			<td><c:forEach items="${u.getRoles()}" var="r">
					<td>${r.getRoleName()}</td>
				</c:forEach></td>
			<td><a href="deleteUser/${u.getIdUser()}">Supprimer</a></td>
			<td><a href="editCat/${cat.getIdUser()}">Edit</a></td>
			
		</tr>
	</c:forEach>
</table>
</div>