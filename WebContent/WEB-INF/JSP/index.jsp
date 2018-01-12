<%-- Een welkom pagina --%>
<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix='fmt' uri='http://java.sun.com/jsp/jstl/fmt'%>
<%@page import='java.time.LocalDateTime'%>
<%@page import='be.vdab.entities.Persoon'%>
<%@page import='be.vdab.entities.Adres'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='nl'>
	<head>
		<title>Pizza Luigi</title>
		<link rel='icon' href='images/favicon.ico'>
		<meta name='viewport' content='width=device-width,initial-scale=1'>
		<link rel='stylesheet' href='styles/default.css'>	
		<c:import url="/WEB-INF/JSP/head.jsp">
			<c:param name='title' value="Pizza's" />
		</c:import>
	</head>
	<fmt:parseDate value="${nu}" pattern="yyyy-MM-dd" var="nuAlsDate" type="date"/>
	<div>Vandaag: <fmt:formatDate value="${nuAlsDate}" type='date' dateStyle='long'/></div>
	<body>
		<c:import url='/WEB-INF/JSP/menu.jsp'/>
		<h1>Pizza Luigi</h1>
		<img src='<c:url value="/images/pizza.jpg"/>' alt='pizza' class='fullwidth'>
		<h2>${begroeting}</h2>
		<h2>De zaakvoerder</h2>
			<dl>
				 <dt>Voornaam</dt><dd>${zaakvoerder.voornaam}</dd>
				 <dt>Familienaam</dt><dd>${zaakvoerder.familienaam}</dd>
				 <dt>Aantal kinderen</dt><dd>${zaakvoerder.aantalKinderen}</dd>
				 <dt>Gehuwd</dt><dd>${zaakvoerder.gehuwd ? 'Ja' : 'Nee'}</dd>
				 <dt>Adres</dt>
				 <dd>${zaakvoerder.adres.straat} ${zaakvoerder.adres.huisNr}<br>
				 	${zaakvoerder.adres.postcode} ${zaakvoerder.adres.gemeente}</dd>
				 <dt>Aantal pizza's verkocht</dt>
				 <dd><fmt:formatNumber value='${aantalPizzasVerkocht}'/></dd>
			</dl>
		<div>Deze pagina werd ${aantalKeerBekeken} keer bekeken.</div>
		<div>WebMaster:
			<a href='mailto:${initParam.emailAdresWebMaster}'>${initParam.emailAdresWebMaster}</a></div>
	</body>
</html>