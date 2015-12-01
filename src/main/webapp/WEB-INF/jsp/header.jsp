<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Biblioteca XPTO</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="" />
<link
	href="<c:url value='/webjars/bootstrap/3.3.6/css/bootstrap.min.css'/>"
	rel="stylesheet" />
<link
	href="<c:url value='/webjars/bootstrap/3.3.6/css/bootstrap-theme.min.css'/>"
	rel="stylesheet" />
</head>
<body>
	<header class="container col-xs-12 col-md-12">
		<div class="jumbotron">
			<h1>Biblioteca XPTO</h1>
		</div>
		<nav class="navbar">
			<ul class="nav nav-tabs nav-justified">
				<li><a href="<c:url value='/' />">Home</a></li>
				<li><a href="<c:url value='/livro/lista'/>">Livros</a></li>
				<li><a href="<c:url value='/editora/lista'/>">Editora</a></li>
				<li><a href="<c:url value='/emprestimo/lista'/>">Empréstimo</a></li>
				<li><a href="<c:url value='/usuario/lista'/>">Usuários</a></li>
			</ul>

		</nav>
	</header>
	<div class="container">
		<main class="container col-xs-12 col-md-12">