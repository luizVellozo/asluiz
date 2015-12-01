<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<form>
	<fieldset>
		<legend>Novo Aluno</legend>
		<div class="form-group">
			<label for="nome">Nome Completo:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-user"></span> <input
					type="text" class="form-control" id="nome" required />
			</div>
		</div>
		<div class="form-group">
			<label for="matricula">Matrícula:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-tag"></span> <input
					type="number" min="10000" max="99999" class="form-control"
					id="matricula" required />
			</div>
		</div>
	</fieldset>

	<button type="submit" class="btn btn-primary btn-lg">
		<span class="glyphicon glyphicon-thumbs-up"></span> Cadastrar Aluno
	</button>
</form>

<c:import url="/WEB-INF/jsp/footer.jsp" />