package com.viddygames;

public class VideoGame {

	private String gameID = null;
	private String isActive = null;
	private String gameTitle = null;
	private String gameGenre = null;
	private String gameConsole = null;
	private String gameDeveloper = null;
	private String gamePublisher = null;
	private String gameReleaseDate = null;

	public VideoGame(String gameID, String isActive, String gameTitle, String gameGenre, String gameConsole,
			String gameDeveloper, String gamePublisher, String gameReleaseDate) {
		super();
		this.gameID = gameID;
		this.isActive = isActive;
		this.gameTitle = gameTitle;
		this.gameGenre = gameGenre;
		this.gameConsole = gameConsole;
		this.gameDeveloper = gameDeveloper;
		this.gamePublisher = gamePublisher;
		this.gameReleaseDate = gameReleaseDate;
	}

	public VideoGame() {
		super();
	}

	public String getGameID() {
		return gameID;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public String getGameGenre() {
		return gameGenre;
	}

	public void setGameGenre(String gameGenre) {
		this.gameGenre = gameGenre;
	}

	public String getGameConsole() {
		return gameConsole;
	}

	public void setGameConsole(String gameConsole) {
		this.gameConsole = gameConsole;
	}

	public String getGameDeveloper() {
		return gameDeveloper;
	}

	public void setGameDeveloper(String gameDeveloper) {
		this.gameDeveloper = gameDeveloper;
	}

	public String getGamePublisher() {
		return gamePublisher;
	}

	public void setGamePublisher(String gamePublisher) {
		this.gamePublisher = gamePublisher;
	}

	public String getGameReleaseDate() {
		return gameReleaseDate;
	}

	public void setGameReleaseDate(String gameReleaseDate) {
		this.gameReleaseDate = gameReleaseDate;
	}

	@Override
	public String toString() {
		return "VideoGame [gameID=" + gameID + ", isActive=" + isActive + ", gameTitle=" + gameTitle + ", gameGenre="
				+ gameGenre + ", gameConsole=" + gameConsole + ", gameDeveloper=" + gameDeveloper + ", gamePublisher="
				+ gamePublisher + ", gameReleaseDate=" + gameReleaseDate + "]";
	}

}
