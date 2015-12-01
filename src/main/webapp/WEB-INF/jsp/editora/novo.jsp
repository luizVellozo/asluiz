<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<form action="<c:url value='/editora/cadastra'/>" method="post">
	<fieldset>
		<legend>Nova Editora</legend>
		<div class="form-group">
			<label for="nome">Nome:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-book"></span> <input
					type="text" class="form-control" id="nome" name="editora.nome" required />
			</div>
		</div>
	</fieldset>

	<button type="submit" class="btn btn-primary btn-lg">
		<span class="glyphicon glyphicon-thumbs-up"></span> Cadastrar Editora
	</button>
</form>

<c:import url="/WEB-INF/jsp/footer.jsp" />