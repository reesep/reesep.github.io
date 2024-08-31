
public class VideoGame {

	private String name;
	private int year;
	private int review;
	private int num_of_players;
	
	public VideoGame(String name, int year, int review, int nop) {
		this.name = name;
		this.year = year;
		this.review = review;
		this.num_of_players = nop;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getReviewScore() {
		return this.review;
	}
	
}
