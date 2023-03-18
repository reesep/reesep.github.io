
public class GameEntry {

	private String name;
	private int score;
	
	public GameEntry(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void printEntry() {
		
		System.out.println(this.name + " " + this.score);
		
	}
	
	
}
