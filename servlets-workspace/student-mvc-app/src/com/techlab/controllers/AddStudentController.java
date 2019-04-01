package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		if (session.isNew()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("firstName") == "" || request.getParameter("lastName") == ""
				|| request.getParameter("rollNumber") == "") {
			RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
			request.setAttribute("firstName", request.getParameter("firstName"));
			request.setAttribute("lastName", request.getParameter("lastName"));
			request.setAttribute("rollNumber", request.getParameter("rollNumber"));
			dispatcher.forward(request, response);
			System.out.println("AddStudentController add post method");
		} else {
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			int rollNumber = (Integer.parseInt(request.getParameter("rollNumber")));

			System.out.println(firstName + "=" + lastName + "=" + rollNumber);
			StudentsService expert = new StudentsService();
			expert.addStudent(firstName, lastName, rollNumber);
			response.sendRedirect("students");
		}

	}

}
