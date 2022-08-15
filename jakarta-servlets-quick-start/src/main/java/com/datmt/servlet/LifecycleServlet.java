package com.datmt.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void init() {
		System.out.println("HelloServlet on init");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("HelloServlet on GET request");
		response.getWriter().append("Handling in LifecycleServlet");
	}
	

	
	public void destroy() {
		System.out.println("HelloServlet on destroy");
	}

}
