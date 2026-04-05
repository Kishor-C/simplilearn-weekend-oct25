package com.examples.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.examples.Profile;
import com.examples.dao.ProfileDao;

/**
 * Servlet implementation class DisplayAllServlet
 */
@WebServlet("/DisplayAllServlet")
public class DisplayAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// this method should invoke findAll and pass the list to the JSP
		ProfileDao dao = new ProfileDao();
		List<Profile> list = dao.findAll();
		request.setAttribute("profiles", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayAll.jsp");
		dispatcher.forward(request, response);
	}

	

}
