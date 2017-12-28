package be.vdab.servlets;

import java.io.IOException;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeadersServlet
 */
@WebServlet("/headers.htm")
public class HeadersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/headers.jsp";
//	private final Map<String, String> browsers = new HashMap<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public HeadersServlet() {
//        browsers.put("firefox", "Firefox");
//        browsers.put("chrome", "Chrome");
//        browsers.put("msie", "Internet Explorer");
//        browsers.put("trident", "Internet Explorer");
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> headers = new LinkedHashMap<>();
		for (Enumeration<String> headerNames = request.getHeaderNames(); headerNames.hasMoreElements(); ) {
			String headerName = headerNames.nextElement();
			headers.put(headerName, request.getHeader(headerName));
		}
		request.setAttribute("headers", headers);
//		String userAgent = request.getHeader("user-agent").toLowerCase();
//		browsers.entrySet().stream().filter(entry -> userAgent.contains(entry.getKey()))
//			.findFirst().ifPresent(browser -> request.setAttribute("browser", browser));
		request.getRequestDispatcher(VIEW).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
