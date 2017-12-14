<%-- Een welkom pagina --%>
<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@page import='java.time.LocalDateTime'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='nl'>
	<head>
		<title>Pizza Luigi</title>
		<link rel='icon' href='images/favicon.ico'>
		<meta name='viewport' content='width=device-width,initial-scale=1'>
		<link rel='stylesheet' href='styles/default.css'>	
	</head>
	<body>
		<h1>Pizza Luigi</h1>
		<img src='images/pizza.jpg' alt='pizza' class='fullwidth'>
		<h2>${begroeting}</h2>
	</body>
</html>