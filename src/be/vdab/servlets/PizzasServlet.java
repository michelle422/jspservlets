package be.vdab.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.vdab.entities.Pizza;

/**
 * Servlet implementation class PizzasServlet
 */
@WebServlet("/PizzasServlet")
public class PizzasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "/WEB-INF/JSP/pizzas.jsp";
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("pizzas", 
				Arrays.asList(new Pizza(12, "Prosciutto", BigDecimal.valueOf(4), true),
						 new Pizza(14, "Margherita", BigDecimal.valueOf(5), false),
						 new Pizza(17, "Calzone", BigDecimal.valueOf(4), false)));
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
