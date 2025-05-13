
public class ScoreboardDemo {

	public static void main(String[] args) {
		
		Scoreboard scoreboard = new Scoreboard();
		
		scoreboard.addScore(4500, "Reese");
		scoreboard.addScore(4500, "John");
		scoreboard.addScore(8000, "Sally");
		scoreboard.addScore(500, "Jack");
		scoreboard.addScore(7500, "Jill");
		scoreboard.addScore(5, "Sarah");
		scoreboard.addScore(15000, "Clem");

		scoreboard.printScoreboard();
		System.out.println();
		scoreboard.removeScore("Sally");
		scoreboard.printScoreboard();
		System.out.println();
		scoreboard.printTop5();
		
	}

}
