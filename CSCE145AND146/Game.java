// Made By Damian Sclafani
package CSCE145AND146;

public class Game {
    private String game;
	private String console;
	
	public Game()
	{
		this.game = "error";
		this.console = "error";
	}
	public Game(String aGame, String aConsole)
	{
		this.setGame(aGame);
		this.setConsole(aConsole);
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String toString()
	{
		return "Game: " +this.game+" Console: " +this.console;
	}
}
