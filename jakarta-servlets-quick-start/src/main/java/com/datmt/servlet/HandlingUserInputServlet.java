package com.datmt.servlet;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/handling-user-input-servlet")
public class HandlingUserInputServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Map<String, String[]> params = req.getParameterMap();	
		
		System.out.println("Print GET parameters");
		
		for (String key : params.keySet()) {
			System.out.println(key + " => " + String.join(", ", params.get(key)));
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Map<String, String[]> params = req.getParameterMap();	
		System.out.println("Print POST parameters");
		
		for (String key : params.keySet()) {
			System.out.println(key + " => " + String.join(", ", params.get(key)));
		}
	}

}
