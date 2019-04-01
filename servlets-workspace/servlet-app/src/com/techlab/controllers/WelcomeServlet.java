package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();
		System.out.println("Welcome to Servlet Page.");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet method excute.");
		PrintWriter out = response.getWriter();
		if (request.getParameter("devloper") != null) {
			for (int i = 0; i <= 6; i++) {
				out.print("<h" + i + ">Welcome to Servlet. Mr." + request.getParameter("devloper") + "<h" + i + ">");
			}
		} else {
			for (int i = 0; i <= 6; i++) {
				out.print("<h" + i + ">Welcome to Servlet." + "<h" + i + ">");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		System.out.println("doPost method excute.");
	}

}
