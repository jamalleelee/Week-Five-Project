package com.viddygames;

import java.sql.*;
import java.util.ArrayList;

public class DAO {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root&autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASSWORD = "sesame";
	public static final ArrayList<VideoGame> videoGamesInMyList = new ArrayList<>();

	static Connection CONN = null;
	static Statement STMT = null;
	static PreparedStatement PREP_STMT = null;
	static ResultSet RES_SET = null;

	public static void connectToDB() {

		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting To Database...");
			CONN = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Connected To Database.");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed To Connected To Database.");
			e.printStackTrace();
		}
	} // connectToDB

	public static void readFromDB() {

		connectToDB();

		try {

			STMT = CONN.createStatement();
			RES_SET = STMT.executeQuery("SELECT * FROM video_games.video_games;");

			while (RES_SET.next()) {

				VideoGame videoGameInDB = new VideoGame();

				videoGameInDB.setGameID(RES_SET.getString("video_game_id"));
				videoGameInDB.setIsActive(RES_SET.getString("video_game_active"));
				videoGameInDB.setGameTitle(RES_SET.getString("video_game_title"));
				videoGameInDB.setGameGenre(RES_SET.getString("video_game_genre"));
				videoGameInDB.setGameConsole(RES_SET.getString("video_game_console"));
				videoGameInDB.setGameDeveloper(RES_SET.getString("video_game_developer"));
				videoGameInDB.setGamePublisher(RES_SET.getString("video_game_publisher"));
				videoGameInDB.setGameReleaseDate(RES_SET.getString("video_game_release_date"));

				videoGamesInMyList.add(videoGameInDB);
			}
			for (VideoGame videoGame : videoGamesInMyList) {

				// System.out.println(videoGame);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	} // readFromDB

} // class
