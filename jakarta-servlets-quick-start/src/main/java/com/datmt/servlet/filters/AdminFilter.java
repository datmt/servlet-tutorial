package com.datmt.servlet.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.management.RuntimeErrorException;


@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter extends HttpFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String user = ((HttpServletRequest) request).getHeader("user");
		System.out.println("Filtering request to admin pages");
		
		if (user == null) {
			response.getWriter().append("Missing credentials");
			
			return;
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}


}
