<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<div class="page-header">
	<h3>Livros</h3>
</div>
<table class="table table-hover">
	<thead>
		<tr>
			<th>#</th>
			<th>Nome</th>
			<th>Código</th>
			<th>Editora</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="livro" items="${livroList}">
			<tr>
				<td>${livro.id}</td>
				<td>${livro.titulo}</td>
				<td>${livro.codigo}</td>
				<td>${livro.editora.nome}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a class="btn btn-primary" href="<c:url value='/livro/novo'/>"><span
	class="glyphicon glyphicon-plus"></span> Novo</a>

<c:import url="/WEB-INF/jsp/footer.jsp" />