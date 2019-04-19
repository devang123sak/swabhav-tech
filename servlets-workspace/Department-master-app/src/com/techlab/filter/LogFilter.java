package com.techlab.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = { "/*" }, initParams = {
		@WebInitParam(name = "test-param", value = "Initialization Paramter") })
public class LogFilter implements Filter {

	public LogFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest url = ((HttpServletRequest) request);
		System.out.println("Url: " + url.getRequestURI());
		System.out.println("IP " + url.getRemoteAddr());
		System.out.println(" Time " + new Date().toString());
		System.out.println();
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		String testParam = config.getInitParameter("test-param");
		System.out.println("Test Param: " + testParam);
	}

}
