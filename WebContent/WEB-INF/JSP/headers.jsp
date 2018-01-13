<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib uri='http://vdab.be/tags' prefix='vdab'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!doctype html>
<html lang='nl'>
	<head>
		<vdab:head title="Headers"/>
	</head>
	<body>
		<vdab:menu/>
		<dl>
			<c:forEach var='h' items='${headers}'>
				<dt>${h.key}</dt><dd>${h.value}</dd>
			</c:forEach>
		</dl>
<%-- 		Je browser: ${empty browser ? "onbekend" : browser} --%>
	</body>
</html>
