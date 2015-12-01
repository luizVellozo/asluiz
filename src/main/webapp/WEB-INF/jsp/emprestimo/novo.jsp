<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<form action="<c:url value='/emprestimo/cadastra'/>" method="post">
	<fieldset>
		<legend>Novo Empréstimo</legend>
		<div class="form-group">
			<label for="aluno">Para:</label> <select class="form-control"
				id="aluno" name="emprestimo.aluno.id">
				<c:forEach var="aluno" items="${alunoList}">
					<option value="${aluno.id}">${aluno.nome}</option>
				</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<label for="livro">Livro:</label> <select class="form-control"
				id="livro" name="emprestimo.livro.id">
				<c:forEach var="livro" items="${livroList}">
					<option value="${livro.id}">${livro.titulo}</option>
				</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<label for="dataDeEntrega">Data de Entrega:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-tag"></span> <input
					type="date" class="form-control" id="dataDeEntrega" required
					name="emprestimo.dataDeEntrega" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="funcionario">Funcionário:</label> <select class="form-control"
				id="funcionario" name="emprestimo.funcionario.id">
				<c:forEach var="funcionario" items="${funcionarioList}">
					<option value="${funcionario.id}">${funcionario.nome}</option>
				</c:forEach>
			</select>
		</div>

	</fieldset>

	<button type="submit" class="btn btn-primary btn-lg">
		<span class="glyphicon glyphicon-thumbs-up"></span> Cadastrar Empréstimo
	</button>
</form>

<c:import url="/WEB-INF/jsp/footer.jsp" />