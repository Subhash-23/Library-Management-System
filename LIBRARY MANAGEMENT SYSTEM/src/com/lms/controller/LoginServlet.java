package com.lms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String password = request.getParameter("pass");
		String msg = "";

		if (uname.equals("Admin") && password.equals("123")) {

			RequestDispatcher rd = request.getRequestDispatcher("LandingPage.jsp");
			request.setAttribute("uname", uname);
			rd.forward(request, response);

		} else if (uname.equals("") && password.equals("")) {

			RequestDispatcher rd1 = request.getRequestDispatcher("Login.jsp");
			msg = "*Fields are mandatory";
			request.setAttribute("msg",msg);
			rd1.include(request, response);
		} else {
			RequestDispatcher rd1 = request.getRequestDispatcher("Login.jsp");
			msg = "Sorry username or password is error!";
			request.setAttribute("msg",msg);
			rd1.include(request, response);
		}
	}
}
