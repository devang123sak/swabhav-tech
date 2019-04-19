package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("excute login controller get method");
	RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
	dispatcher.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String pageRequest =request.getParameter("pageRequest");
			System.out.println(pageRequest);

			if (name.equalsIgnoreCase(password)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("user",  name);
				response.sendRedirect(pageRequest);
				
			}
			
			
			
				if(url==null) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("views/home.jsp");
					dispatcher.forward(request, response);
					return;
				}
				if(url.endsWith("add")) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("views/addForm.jsp");
					dispatcher.forward(request, response);
				}
				if(url.endsWith("edit")) {
					String[] URL = url.split("/");
					System.out.println(URL[0]);
					DepartmentsEditController controller = new DepartmentsEditController();
					controller.doGet(request, response, URL[0]);
				}
				
			} else {
				request.setAttribute("name", request.getParameter("name"));
				request.setAttribute("password", request.getParameter("password"));
				RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.html");
				dispatcher.forward(request, response);
				return;
			}
			
	}

}
