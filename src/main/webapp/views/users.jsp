<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html">
<html>
<head>
<title>Liste de users</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/../resources/static/style.css">
</head>
<body>
<br/><br/><br/>
	<div id="formProducts">
		<f:form modelAttribute="user" method="post" action="saveUser">
			<table border="1">
				<tr>
					<th>Pr�nom:</th>
					<td><f:input path="firstName" /></td>
				</tr>
				<tr>
					<th>Nom:</th>
					<td><f:input path="lastName" /></td>
				</tr>
				<f:hidden path="id" />
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</f:form>
	</div>


	<div id="listProducts">
		<table class="table1" border="1">
			<tr>
				<th>ID</th>
				<th>Pr�nom</th>
				<th>Nom</th>
			</tr>
			<c:forEach items="${users}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.firstName}</td>
					<td>${u.lastName}</td>
					<td><a href="deleteUser?id=${u.id}">Supprimer</a></td>
					<td><a href="editUser?id=${u.id}">Modifier</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>