<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Benvenuto ${user}</h1>
<h2>sono le ${currentTime} </h2>
<form action="" method="post">
<label>User: </label><input name="username" type="text"/><br>
<label>Password: </label><input type="password"/><br>
<input type="submit" text="login"/> 

</form>
</body>
</html>