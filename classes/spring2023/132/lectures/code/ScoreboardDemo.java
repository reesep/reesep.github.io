
public class ScoreboardDemo {

	public static void main(String[] args) {
		
		Scoreboard s = new Scoreboard("Dig Dug");
		
		GameEntry g1 = new GameEntry("Jack", 250);
		GameEntry g2 = new GameEntry("Sally", 125);
		GameEntry g3 = new GameEntry("Sarah", 300);
		
		s.addToScoreboard(g1);
		s.addToScoreboard(g2);
		s.addToScoreboard(g3);
		
		GameEntry g4 = new GameEntry("Diego", 400);
		GameEntry g5 = new GameEntry("Sam", 275);
		
		s.addToScoreboard(g4);
		s.addToScoreboard(g5);
		
		s.printScoreboard();
		System.out.println();
		s.printScorboardN(10);
		

	}

}
