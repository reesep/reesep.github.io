
public class GameEntry implements Comparable<GameEntry>{

	private int score;
	private String name;
	
	public GameEntry(int s, String n) {
		this.score = s;
		this.name = n;
	}
	
	public void printEntry() {
		System.out.println(this.name + "-----" + this.score);
	}
	
	//controls the behavior of comparing two objects (used when we sort the arraylist)
	//when comparing objects, compare the SCORES of the objects.
	@Override
	public int compareTo(GameEntry other) {
		
		if(this.score > other.score) {
			return -1;
		}
		else if(this.score < other.score) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
