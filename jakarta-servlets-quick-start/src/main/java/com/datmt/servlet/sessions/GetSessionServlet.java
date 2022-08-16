package com.datmt.servlet.sessions;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/get-session")
public class GetSessionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(true);
		
		
		String greetings = "Hello, I don't know your name!";
		
		String yourName = session.getAttribute("your_name").toString();
		
		if (yourName != null) {
			greetings = "Hi, " + yourName + ". Welcome back!";
					
		}
		
		resp.getWriter().println(greetings);
	}

}
