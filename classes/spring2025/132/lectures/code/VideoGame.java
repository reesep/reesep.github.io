
public class VideoGame {

	private String name;
	private int num_of_players;
	private int score;
	
	public VideoGame(String n, int p, int s) {
		
		this.name = n;
		this.num_of_players = p;
		this.score = s;
		
	}
	
	public int getRating() {
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}
	
}
