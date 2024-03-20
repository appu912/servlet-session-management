package com.apoorv;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(request.getQueryString());
		response.setContentType("text/html");
		response.getWriter().println("username: " + userName + "\npassword: " + password);
		response.getWriter().flush();
	}

}
