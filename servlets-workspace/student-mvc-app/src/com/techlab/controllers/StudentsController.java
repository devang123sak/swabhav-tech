package com.techlab.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/students")
public class StudentsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get method excute");
		StudentsService display = new StudentsService();
		List<Student> studentList = display.getStudentList();

		System.out.println(studentList);
		request.setAttribute("studentDetails", studentList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("students.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
