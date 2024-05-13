import java.util.ArrayList;
import java.util.Collections;

public class Scoreboard {

	private ArrayList<GameEntry> data;
	private String name;
	
	public Scoreboard(String n) {
		this.name = n;
		data = new ArrayList<GameEntry>();
	}
	
	public void addToScoreboard(String n, int s) {
		GameEntry g = new GameEntry(n, s);
		data.add(g);
		Collections.sort(data);
		
	}
	
	public void printScoreboard() {
		
		System.out.println("Scoreboard for: " + this.name);
		System.out.println("------------------------------");
		for(GameEntry g: data) {
			System.out.println(g);
		}
	}

	public void printNScores(int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.println(data.get(i));
		}
		
	}
	
	public void removeFromScoreboard(String search) {
		
		for(int i = 0; i < data.size(); i++) {
			
			String name = data.get(i).getName();
			if(name.equals(search)) {
				data.remove(i);
			}
			
		}
		
	}
	
	
	
}
