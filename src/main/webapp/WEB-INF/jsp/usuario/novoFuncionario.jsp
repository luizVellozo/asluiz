<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<form action="<c:url value='/usuario/cadastraFuncionario'/>" method="post">
	<fieldset>
		<legend>Novo Aluno</legend>
		<div class="form-group">
			<label for="nome">Nome Completo:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-user"></span> <input
					type="text" class="form-control" id="nome" required name="funcionario.nome" />
			</div>
		</div>
		<div class="form-group">
			<label for="cpf">CPF:</label>
			<div class="input-group">
				<span class="input-group-addon glyphicon glyphicon-tag"></span> <input
					type="text" pattern="[0-9]{11}" class="form-control"
					id="cpf" required name="funcionario.cpf" />
			</div>
		</div>
		<div class="form-group">
			<label for="editora">Perfil:</label> <select class="form-control"
				id="editora" name="funcionario.perfil">
					<c:forEach var="perfil" items="${perfis}">
						<option value="${perfil}">${perfil.label}</option>
					</c:forEach>
			</select>
		</div>
		
	</fieldset>

	<button type="submit" class="btn btn-primary btn-lg">
		<span class="glyphicon glyphicon-thumbs-up"></span> Cadastrar Funcionário
	</button>
</form>

<c:import url="/WEB-INF/jsp/footer.jsp" />