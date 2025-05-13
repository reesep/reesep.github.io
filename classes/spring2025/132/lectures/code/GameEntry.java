
public class GameEntry implements Comparable<GameEntry>{

	private int score;
	private String name;
	
	public GameEntry(int s, String n) {
		this.score = s;
		this.name = n;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	//tells java how to sort GameEntry object when we use Collections.sort()
	public int compareTo(GameEntry other) {

		if(this.score > other.score) {
			return -1;
		}
		else if(this.score == other.score) {
			return 0;
		}
		else {
			return 1;
		}
		
	}
	
}
