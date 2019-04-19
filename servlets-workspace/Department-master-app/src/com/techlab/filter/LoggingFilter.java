package com.techlab.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/edit", "/add" }, initParams = {
		@WebInitParam(name = "test-param", value = "Initialization Paramter") })
public class LoggingFilter implements Filter {

	public LoggingFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

//		HttpServletRequest url = ((HttpServletRequest) request);
//		System.out.println("Url: " + url.getRequestURI());
//
//		if (url.getRequestURI().equals("/Department-master-app/add")) {
//			request.setAttribute("pageRequest", "add");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
//			dispatcher.forward(request, response);
//		}
//
//		if (url.getRequestURI().equals("/Department-master-app/edit")) {
//			request.setAttribute("pageRequest", "edit");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
//			dispatcher.forward(request, response);
//
//		}
		
		
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		HttpSession session =req.getSession(false);
		if(session==null || session.getAttribute("user")==null) {
//			res.sendRedirect(req.getContextPath()+"/login");
		}else {
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
