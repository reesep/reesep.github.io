
public class VideoGame {

	private String name;
	private String rating;
	
	public VideoGame(String n, String r) {
		this.name = n;
		this.rating = r;
	}
	
	public void printInfo() {
		System.out.println(this.name + "(Rating: " + this.rating + ")");
	}
	
}
