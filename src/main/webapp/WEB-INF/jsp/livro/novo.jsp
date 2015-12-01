<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<form action="<c:url value='/livro/cadastra'/>" method="post">
	<fieldset>
		<legend>Novo Livro</legend>
		<div class="form-group">
			<label for="titulo">Título:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-book"></span> <input
					type="text" class="form-control" id="titulo" required
					name="livro.titulo" />
			</div>
		</div>
		<div class="form-group">
			<label for="codigo">Código:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-tag"></span> <input
					type="text" class="form-control" id="codigo" required
					name="livro.codigo" />
			</div>
		</div>

		<div class="form-group">
			<label for="editora">Editora:</label> <select class="form-control"
				id="editora" name="livro.editora.id">
				<c:forEach var="editora" items="${editoraList}">
					<option value="${editora.id}">${editora.nome}</option>
				</c:forEach>
			</select>
		</div>

	</fieldset>

	<button type="submit" class="btn btn-primary btn-lg">
		<span class="glyphicon glyphicon-thumbs-up"></span> Cadastrar Livro
	</button>
</form>

<c:import url="/WEB-INF/jsp/footer.jsp" />