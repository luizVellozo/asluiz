<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<div class="page-header">
	<h3>Empréstimos</h3>
</div>
<table class="table table-hover">
	<thead>
		<tr>
			<th>#</th>
			<th>Aluno</th>
			<th>Livro</th>
			<th>Entrega</th>
			<th>Funcionário</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="emprestimo" items="${emprestimoList}">
			<tr>
				<td>${emprestimo.id}</td>
				<td>${emprestimo.aluno.nome}</td>
				<td>${emprestimo.livro.titulo}</td>
				<td>${emprestimo.dataDeEntrega}</td>
				<td>${emprestimo.funcionario.nome}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a class="btn btn-primary" href="<c:url value='/emprestimo/novo'/>"><span
	class="glyphicon glyphicon-plus"></span> Novo</a>

<c:import url="/WEB-INF/jsp/footer.jsp" />