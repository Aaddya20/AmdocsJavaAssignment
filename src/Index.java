package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter(); 
		String name= request.getParameter("name");
		String email=request.getParameter("email");
		String number=request.getParameter("mn");
		int age=(Integer.parseInt(request.getParameter("age")));
		String pass=request.getParameter("psw");
		String type=request.getParameter("type");
		Connection_db con;
		try {
			con = new Connection_db();
			con.insert(new Student(name,email,number,age,pass,type));
			RequestDispatcher rp=request.getRequestDispatcher("login.html");
			rp.forward(request, response);
		}
     catch (SQLException e) {
			
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}