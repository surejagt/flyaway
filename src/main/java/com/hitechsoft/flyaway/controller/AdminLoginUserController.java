package com.hitechsoft.flyaway.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hitechsoft.flyaway.dao.AdminLoginUserDao;
@WebServlet("/login")
public class AdminLoginUserController extends HttpServlet {

	private static final long serialVersionUID = 8544933243371088078L;
	private AdminLoginUserDao userdao;
	public void init() {
		userdao = new AdminLoginUserDao();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        response.sendRedirect("admin-login.jsp");
		    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        try {
		            authenticate(request, response);
		        } catch (Exception e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		    }
	private void authenticate(HttpServletRequest request, HttpServletResponse response)
		    throws Exception {
		        String username = request.getParameter("username");
		        String password = request.getParameter("password");

		        if (userdao.validate(username, password)) {
		            RequestDispatcher dispatcher = request.getRequestDispatcher("admin-login-success.jsp");
		            dispatcher.forward(request, response);
		        } else {
		            throw new Exception("Login not successful..");
		        }
		        }
}
