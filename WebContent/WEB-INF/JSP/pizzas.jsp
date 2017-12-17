<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@page import='be.vdab.entities.Pizza'%>
<!doctype html>
<html lang='nl'>
	<head>
		<title>Pizza's</title>
		<link rel='icon' href='images/favicon.ico'>
		<meta name='viewport' content='width=device-width,initial-scale=1'>
		<link rel='stylesheet' href='styles/default.css'>
	</head>
	<body>
		<h1>Pizza's
			<c:forEach begin='1' end='5'>
				&#9733; <%-- de HTML code van een ster --%>
			</c:forEach>
		</h1>
		<ul class='zebra'>
			<c:forEach var='entry' items='${pizzas}'>
				<li>${entry.key}: ${entry.value.naam} ${entry.value.prijs}&euro</li>
			</c:forEach>
		</ul>
	</body>
</html>