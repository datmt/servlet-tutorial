package com.datmt.servlet.sessions;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/set-session")
public class SetSessionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String yourName = req.getParameter("your_name");
		
		HttpSession session = req.getSession(true);
		session.setAttribute("your_name", yourName);
		
		resp.setContentType("text/html");
		
		resp.getWriter().println(""
				+ "<form method=\"get\" action=\"#\">"
				+ "<label>Please type your name</label>"
				+ "<input type=\"text\" name=\"your_name\" />"
				+ "<input type=\"submit\" value=\"Submit\" />"
				+ "</form>");
		
	}

}
