
public class GameEntry implements Comparable<GameEntry> {

	private String name;
	private int score;
	
	public GameEntry(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public String toString() {
		return this.name + ": " + this.score;
	}

	@Override
	public int compareTo(GameEntry other) {
		
		return other.score - this.score;
		/*
		if(this.score > other.score) {
			return -1;
		}
		else if(this.score < other.score) {
			return 1;
		}
		else {
			return 0;
		}
		*/
	}

	public String getName() {
		return this.name;
	}
	
	
}
