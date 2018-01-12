package be.vdab.servlets;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IdentificatieServlet
 */
@WebServlet("/identificatie.htm")
public class IdentificatieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/identificatie.jsp";
//	private static final int COOKIE_MAXIMUM_LEEFTIJD =
//			60 /* seconden */ * 30 /* minuten */;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null) {
			String gebruikersnaam = (String) session.getAttribute("gebruikersnaam");
			@SuppressWarnings("unchecked")
			Set<Long> mandje = (Set<Long>) session.getAttribute("mandje");
			if (gebruikersnaam != null) {
				request.setAttribute("gebruikersnaam", gebruikersnaam);
			}
			if (mandje != null) {
				request.setAttribute("mandje", mandje);
			}
		}
		String locale = request.getParameter("locale");
		if (locale != null) {
			request.getSession().setAttribute("locale", locale);
		}
		
//		if (request.getCookies() != null) {
//			for (Cookie cookie : request.getCookies()) {
//				if ("gebruikersnaam".equals(cookie.getName())) {
//					request.setAttribute("gebruikersnaam", URLDecoder.decode(cookie.getValue(), "UTF-8"));
//					break;
//				}
//			}
//		}
		request.getRequestDispatcher(VIEW).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("gebruikersnaam", request.getParameter("gebruikersnaam"));
		session.setAttribute("mandje", request.getParameter("mandje"));
//		Cookie cookie = new Cookie("gebruikersnaam", URLEncoder.encode(request.getParameter("gebruikersnaam"), "UTF-8"));
//		cookie.setMaxAge(COOKIE_MAXIMUM_LEEFTIJD);
//		response.addCookie(cookie);
//		response.sendRedirect(request.getRequestURI());
		
		response.sendRedirect(response.encodeRedirectURL(request.getRequestURI()));
	}

}
