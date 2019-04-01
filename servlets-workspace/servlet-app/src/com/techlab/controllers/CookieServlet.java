package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CookieServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie uiColorCookie = new Cookie("color", "yellow");
		response.addCookie(uiColorCookie);
		uiColorCookie.setMaxAge(60);

//		Cookie setColor = new Cookie("setColor", request.getParameter("setColor"));
//		System.out.println(request.getParameter("setColor"));
//		setColor.setMaxAge(60);
//		response.addCookie(setColor);

		Cookie cookie = null;
		Cookie[] cookies = null;

		// Get an array of Cookies associated with the this domain
		cookies = request.getCookies();

		if (cookies != null) {
			System.out.println("<h2> Found Cookies Name and Value</h2>");
			PrintWriter out = response.getWriter();

			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				if (cookie.getName().equals("color")) {
					out.print("color :"+request.getParameter("color"));
				}
			}
		} else {
			System.out.println("No cookies founds");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
	}

}
