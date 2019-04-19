package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.model.Department;
import com.techlab.service.DepartmentService;

@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int DeptNo = (Integer.parseInt(request.getParameter("DeptNo")));

		String dp = Integer.toString(DeptNo);
//			editDept.updateDept(DeptNo);
		DepartmentService editDept = new DepartmentService();
		Department d = editDept.getDeptData(DeptNo);
		System.out.println("d=" + d);
		request.setAttribute("deptNumber", d.getDeptNo());
		request.setAttribute("deptName", d.getdName());
		request.setAttribute("deptLocation", d.getLoc());
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/edit.jsp");
		dispatcher.forward(request, response);

		System.out.println("edit get method");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String deptNumber = request.getParameter("deptNumber");
		String deptName = request.getParameter("deptName");
		int deptLocation = (Integer.parseInt(request.getParameter("deptLocation")));
		DepartmentService update= new DepartmentService();
//		update.updateDept();
		response.sendRedirect("students");
//	
		System.out.println("edit post method");
		
	}

}
