package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.service.DepartmentService;

@WebServlet("/display")
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DisplayController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DepartmentService departmentService=new DepartmentService();
		request.setAttribute("deptDetails", departmentService.getList());		
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/display.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
