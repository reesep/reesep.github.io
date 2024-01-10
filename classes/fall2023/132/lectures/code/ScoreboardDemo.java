
public class ScoreboardDemo {

	public static void main(String[] args) {
		
		Scoreboard s = new Scoreboard("Dig Dug");
		
		GameEntry g1 = new GameEntry(500, "Reese");
		GameEntry g2 = new GameEntry(250, "Susan");
		GameEntry g3 = new GameEntry(677, "Mike");
		GameEntry g4 = new GameEntry(800, "Dustin");
		GameEntry g5 = new GameEntry(300, "Spencer");
		
		s.addToScoreboard(g1);
		s.addToScoreboard(g2);
		s.addToScoreboard(g3);
		s.addToScoreboard(g4);
		s.addToScoreboard(g5);

		s.addToScoreboard(new GameEntry(1000,"Joe"));
		s.addToScoreboard(new GameEntry(430,"Sally"));
		//s.printNScores(5);
		
		s.removeFromScoreboard("Dustin");
		s.printScoreboard();
	}

}
