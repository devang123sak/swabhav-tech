package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Authentication")
public class AuthenticationServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	public AuthenticationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get method authentication");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		PrintWriter printWriter = response.getWriter();
		System.out.println("post method authentication");
		String uname = request.getParameter("fname");
		String pass = request.getParameter("fpassword");

		if (uname.equals(pass)) {
			printWriter.println("<h1>Welcome," + uname + "</h1>");
		} else {
			printWriter.println("<h1>Invalid userID & Password. please login again...</h1><br>");
			printWriter.println("<a href='views/login.html'>login.html</a>");
		}

	}

}
