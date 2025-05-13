import java.util.ArrayList;
import java.util.Collections;

public class Scoreboard {

	ArrayList<GameEntry> board;
	
	public Scoreboard() {
		this.board =  new ArrayList<GameEntry>();
	}
	
	public void addScore(int score, String name) {
		GameEntry g = new GameEntry(score, name);
		board.add(g);
		Collections.sort(board);
	}
	
	public void removeScore(String name) {
		for(GameEntry g: board) {
			if(g.getName().equals(name)) {
				board.remove(g);
				break;
			}
		}
	}
	
	public void printScoreboard() {
		int i = 1;
		for(GameEntry g: board) {
			System.out.println(i + ". " + g.getScore()  + "----" + g.getName());
			i++;
		}
	}
	
	public void printTop5() {
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + ". " +board.get(i).getScore() + "----" + board.get(i).getName() );
		}
	}
	
}
