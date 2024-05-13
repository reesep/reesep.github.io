
public class ScoreboardDemo {

	public static void main(String[] args) {
		
		
		Scoreboard s = new Scoreboard("Dig Dug");

		s.addToScoreboard("Jack",500);
		s.addToScoreboard("Liza",10000);
		s.addToScoreboard("Steve",4000);
		s.addToScoreboard("John",1000);
		s.addToScoreboard("Sally",20000);
		s.addToScoreboard("Rick",500);
		s.addToScoreboard("Susan",50);
		
		s.printScoreboard();
		
	}

}
