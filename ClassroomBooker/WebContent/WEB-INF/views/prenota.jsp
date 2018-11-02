<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<meta charset="ISO-8859-1">
<title>Prenota</title>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">Prenotator</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="#">Home</a></li>
					</ul>
					<ul class="nav">
						<li class=""><a href="prenota">Prenota</a></li>
					</ul>
					<ul class="nav pull-right">
						<li class="divider-vertical"></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Dropdown <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li class="divider"></li>
								<li><a href="#">Separated link</a></li>
							</ul></li>
					</ul>
				</div>
				<!-- /.nav-collapse -->
			</div>
		</div>
		<!-- /navbar-inner -->
	</div>



	<div class="container">
		<div class="row">
			<form role="form" class="col-md-9" action="prenota" method="post">
				<h2>Prenotait your aula</h2>
				<div class="form-group">
					<label for="sel1">Select classroom:</label> <select
						class="form-control" name="aula" id="sel1">
						<option>MT7</option>
						<option>MT5</option>
						<option>MT5Bis</option>
						<option>MT7Bis</option>
					</select>
				</div>

				<div class="form-group">
				<label for="date">Start
						Date</label>
					<input id="date" name="start" type="datetime-local"
						class="form-control" required> 
				</div>
				<div class="form-group">
				 <label for="enddate">End
						Date</label>
					<input id="enddate" name="end" type="datetime-local"
						class="form-control" required>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-10 col-sm-2">
						<button type="submit" class="btn btn-default">Submit</button>
					</div>
				</div>

			</form>
		
		</div>
		<c:if test="${not empty error }">
		<div class="row" style="padding-top: 20px">
		<div class="alert alert-danger alert-dismissible">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>Error!</strong> ${error }.
			</div>
			</div>
			</c:if>
	</div>
</body>
</html>