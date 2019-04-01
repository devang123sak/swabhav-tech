package com.techlab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		if (request.getParameter("name") == "" || request.getParameter("password") == "") {
			request.setAttribute("name", request.getParameter("name"));
			request.setAttribute("password", request.getParameter("password"));

			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else {
			String name = request.getParameter("name");
			String password = request.getParameter("password");

			if (name.equalsIgnoreCase(password)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("isLogin",  "yes");
				response.sendRedirect("students");
			}
		}
	}

}
