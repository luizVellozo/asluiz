<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<div class="page-header">
  <h3>Editoras</h3>
</div>
<table class="table table-hover">
	<thead>
		<tr>
			<th>#</th>
			<th>Nome</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="editora" items="${editoraList}">
			<tr>
				<td>${editora.id}</td>
				<td>${editora.nome}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a class="btn btn-primary" href="<c:url value='/editora/novo'/>"><span class="glyphicon glyphicon-plus"></span> Novo</a>

<c:import url="/WEB-INF/jsp/footer.jsp" />