<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<div class="page-header">
	<h3>Alunos</h3>
</div>
<table class="table table-hover">
	<thead>
		<tr>
			<th>#</th>
			<th>Nome</th>
			<th>Matrícula</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="aluno" items="${alunoList}">
			<tr>
				<td>${aluno.id}</td>
				<td>${aluno.nome}</td>
				<td>${aluno.matricula}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a class="btn btn-primary" href="<c:url value='/usuario/novo'/>"><span
	class="glyphicon glyphicon-plus"></span> Novo</a>

<c:import url="/WEB-INF/jsp/footer.jsp" />