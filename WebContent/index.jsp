<%-- Een welkom pagina --%>
<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@page import='java.time.LocalDateTime'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='nl'>
	<head>	<title>Pizza Luigi</title></head>
	<body>
		<h1>
			 <%
			 int uur = LocalDateTime.now().getHour();
			 out.print(uur >= 6 && uur < 12 ? "Goede morgen" :
			 uur >= 12 && uur < 18 ? "Goede middag": "Goede avond");
			 %>
 		</h1>
	</body>
</html>