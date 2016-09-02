package com.viddygamesservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viddygames.DAO;
import com.viddygames.VideoGame;

/**
 * Servlet implementation class AddToDB
 */
@WebServlet("/AddGameToDB")
public class AddGameToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddGameToDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		VideoGame addGameToDB = new VideoGame();

		addGameToDB.setGameTitle(request.getParameter("title"));
		addGameToDB.setGameGenre(request.getParameter("genre"));
		addGameToDB.setGameConsole(request.getParameter("console[]"));
		addGameToDB.setGameDeveloper(request.getParameter("developer"));
		addGameToDB.setGamePublisher(request.getParameter("publisher"));
		addGameToDB.setGameReleaseDate(request.getParameter("release_date"));

		DAO.writeToDB(addGameToDB);
		
		request.getRequestDispatcher("index.html").forward(request, response);
	}

}
