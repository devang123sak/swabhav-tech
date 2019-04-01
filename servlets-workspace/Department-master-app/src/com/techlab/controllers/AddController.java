package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Department;
import com.techlab.service.DepartmentService;


@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/add.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if (request.getParameter("deptNumber") == "" || request.getParameter("deptName") == ""
				|| request.getParameter("deptLocation") == "") {
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/add.jsp");
			request.setAttribute("deptNumber", request.getParameter("deptNumber"));
			request.setAttribute("deptName", request.getParameter("deptName"));
			request.setAttribute("deptLocation", request.getParameter("deptLocation"));
			dispatcher.forward(request, response);
//			System.out.println("AddController add post method");
		} else {
			String deptNumber = request.getParameter("deptNumber");
			String deptName = request.getParameter("deptName");
			String deptLocation = request.getParameter("deptLocation");

//			System.out.println(deptNumber + "=" + deptName + "=" + deptLocation);
			DepartmentService departmentService=new DepartmentService();
			departmentService.addDepartment(new Department(deptNumber, deptName, deptLocation));
			response.sendRedirect("home");
		}
		
	}

}
