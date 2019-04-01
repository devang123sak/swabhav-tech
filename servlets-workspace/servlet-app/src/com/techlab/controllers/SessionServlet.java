package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get excute");

		HttpSession session = request.getSession(true);
		Integer hitsCount = (Integer) session.getAttribute("hitCounter");
		
		String id=session.getId();
		if (hitsCount == null || hitsCount == 0) {
			hitsCount = 1;
		} else {
			hitsCount += 1;
		}
		session.setAttribute("hitCounter", hitsCount);

		System.out.println("Old Counter:"+hitsCount);
		System.out.println("New Counter:"+(hitsCount+1));
		PrintWriter out = response.getWriter();
		
		out.print("Session ID:"+id+"<br>");
		out.print("Old Counter:"+hitsCount+"<br>");
		out.print("New Counter:"+(hitsCount+1));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		System.out.println("post excute");
	}

}
