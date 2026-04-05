package com.examples.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.examples.Profile;
import com.examples.dao.ProfileDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		//LocalDate.parse(String) converts String to LocalDate
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		// create Profile object
		Profile profile = new Profile(name, dob);
		// create ProfileDao
		ProfileDao dao = new ProfileDao();
		int status = dao.save(profile);
		// we can display the success message in the servlet itself
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h3>Successfully stored "+status+" record</h3>");
		out.print("</body></html>");
	}

}
