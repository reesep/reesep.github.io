import java.util.ArrayList;
import java.util.Collections;

public class Scoreboard {

	private ArrayList<GameEntry> scoreboard;
	private String game_name;
	private int size;
	
	public Scoreboard(String n) {
		this.game_name = n;
		this.scoreboard = new ArrayList<GameEntry>();
		this.size = 0;
	}
	
	public void addToScoreboard(GameEntry g) {	
		
		if(this.size == 0) {
			this.scoreboard.add(g);
			this.size++;
		}
		else {
			this.scoreboard.add(g);
			this.size++;
			int start = this.scoreboard.size() - 1;
			while( start > 0 && this.scoreboard.get(start).getScore() > 
					this.scoreboard.get(start-1).getScore() ) {
				
				Collections.swap(scoreboard, start, start-1);
				start--;
				
			}
			
		}
		
	}
	
	public void printScoreboard() {
		System.out.println(this.game_name);
		for(GameEntry g: this.scoreboard) {
			g.printEntry();
		}
		
	}
	
	public void removeFromScoreboard(String n) {
	
		boolean is_found = false;
		for(int i = 0; i < this.scoreboard.size(); i++) {
			
			String player_name = this.scoreboard.get(i).getName();
			if(player_name.equals(n)) {
				this.scoreboard.remove(i);
				this.size--;
				is_found = true;
			}	
		}
		if(is_found == false) {
			System.out.println("Player not found: " + n);
		}
		
	}
	
	public void printScorboardN(int n) {
		
		for(int i = 0; i < n; i++) {
			try {
				this.scoreboard.get(i).printEntry();
			}
			catch(Exception e) {
				System.out.println("???");
			}
		}
	}
	
	
	
	
	
	
	
}
