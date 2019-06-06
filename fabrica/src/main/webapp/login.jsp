<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html; charset=UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Fabrica</title>

<link href="css/bootstrap.css" rel="stylesheet" />
<!-- <link href="css/bootstrap-responsive.css" rel="stylesheet" />  -->
<!-- <link href="css/styles.css" rel="stylesheet" /> -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Cache-Control"
	content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<script>
	function focar() {
		document.getElementById("usuario").focus();
	}
</script>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark"> <a
		class="navbar-brand" href="#">Acesso restrito</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarsExampleDefault">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarsExampleDefault">
		<form class="form-inline my-2 my-lg-0 ml-auto"
			action="j_spring_security_check" method="post">
			<input name="j_username" class="form-control mr-sm-2" type="text"
				placeholder="Usuário"> <input name="j_password"
				class="form-control mr-sm-2" type="password" placeholder="Senha">

					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Acessar</button>
		</form>
	</div>
	</nav>


	<%
		if (request.getParameter("msg") != null) {
			out.print("<div class='alert alert-primary' role='alert'> Usuário ou senha incorretos</div>");
		}
	%>

<br />
<br />
<br />
	<div class="row">
		<div class="col-sm-6">
			<div class="card"">
				<div class="card-body">
					<h5 class="card-title">Prestador</h5>
					<p class="card-text">Encontre um cliente.</p>
					<a href="cadprestador.xhtml" class="card-link">Cadastre-se</a> 
				</div>
			</div>
		</div>
		<div class="col-sm-6">
			<div class="card" ">
				<div class="card-body">
					<h5 class="card-title">Cliente</h5>
					<p class="card-text">Busque um prestador</p>
					<a href="cadcliente.xhtml" class="card-link">Cadastre-se</a> 
				</div>
			</div>
		</div>

		<
	</div>



</body>
</html>