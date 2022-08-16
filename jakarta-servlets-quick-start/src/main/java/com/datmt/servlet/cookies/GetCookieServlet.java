package com.datmt.servlet.cookies;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/get-cookie-servlet")
public class GetCookieServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] cookies = req.getCookies();
		
		String someCookieValue = "";
		
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("some_cookie")) {
					someCookieValue = c.getValue();
				}
			}
		}
		
		resp.getWriter().append("The cookie value for some_cookie is: " + someCookieValue);
	}

}
