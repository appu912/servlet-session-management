package com.apoorv;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, String[]> parameters = request.getParameterMap();
		parameters.forEach((x, y) -> System.out.println(x + " " + y));
//		response.setContentType("text/html");
//		response.getWriter().write("<h1>Hello, " + userName + " with password " + password + " from LoginServlet</h1>");
	}

}
