
public class VideoGame {

	private String name;
	private char rating;
	
	public VideoGame(String name, char rating) {
		this.name = name;
		this.rating = rating;
	}
	
	public String getInfo() {
		return name + " Rating: " + rating; 
	}
	
}
