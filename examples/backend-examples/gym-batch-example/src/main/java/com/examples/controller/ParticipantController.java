package com.examples.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.examples.dao.ParticipantDAO;
import com.examples.model.Participant;

/**
 * Servlet implementation class ParticipantController
 */
@WebServlet("/ParticipantController")
public class ParticipantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read name, phone and batchId
		Participant participant = new Participant(
				request.getParameter("name"), 
				Long.parseLong(request.getParameter("phone")), 
				Integer.parseInt(request.getParameter("batch_id"))
				);
		// dao object
		ParticipantDAO participantDao = new ParticipantDAO();
		int status = participantDao.addParticipant(participant);
		request.setAttribute("status", status);
		RequestDispatcher dispatch = request.getRequestDispatcher("participant_add_success.jsp");
		dispatch.forward(request, response);
	}

}
