package com.techlab.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/edit")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditStudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("EditStudentController get method");

		HttpSession session = request.getSession(true);
		if (session.isNew()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else {
			int rollNumber = (Integer.parseInt(request.getParameter("rollNumber")));
			StudentsService editStudent = new StudentsService();
			System.out.println(editStudent.getRollNumber(rollNumber));
			Student student = editStudent.getRollNumber(rollNumber);

			request.setAttribute("firstName", student.getFirstName());
			request.setAttribute("lastName", student.getLastName());
			request.setAttribute("rollNumber", student.getRollNo());
			RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("EditStudentController post method");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int rollNumber = (Integer.parseInt(request.getParameter("rollNumber")));
		StudentsService editStudent = new StudentsService();
		editStudent.update(firstName, lastName, rollNumber);
		response.sendRedirect("students");

	}

}
