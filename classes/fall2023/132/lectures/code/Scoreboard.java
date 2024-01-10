import java.util.ArrayList;
import java.util.Collections;

public class Scoreboard {

	private String name; //dig dug, pacman, etc
	private ArrayList<GameEntry> scoreboard;
	
	public Scoreboard(String name) {
		this.name = name;
		scoreboard = new ArrayList<GameEntry>();
	}

	public void addToScoreboard(GameEntry g) {
		
		scoreboard.add(g);
		//sort my array (greatest to least)
		Collections.sort(scoreboard);
		
	}
	
	public void printScoreboard() {
		
		System.out.println("Scoreboard for: " + this.name);
		System.out.println("------------------------------");
		for(GameEntry g: scoreboard) {
			g.printEntry();
		}
	}

	public void printNScores(int n) {
		
		for(int i = 0; i < n; i++) {
			scoreboard.get(i).printEntry();
		}
		
	}
	
	public void removeFromScoreboard(String search) {
		
		for(int i = 0; i < scoreboard.size(); i++) {
			
			String name = scoreboard.get(i).getName();
			if(name.equals(search)) {
				scoreboard.remove(i);
			}
			
		}
		
	}
	
}
