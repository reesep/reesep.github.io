import java.util.Arrays;

public class VideoGameAnalysis {

	private VideoGame[] games;
	
	public VideoGameAnalysis(VideoGame[] games) {
		this.games = games;
	}

	public void printAlphabetically() {
		
		String[] onlyNames = new String[1211];
		int i = 0;
		for(VideoGame each: this.games) {
			onlyNames[i] = each.getName();
			i++;
		}
		Arrays.sort(onlyNames);
		
		for(String each: onlyNames) {
			System.out.println(each);
		}
		
	}
	
	public void findHighestGame() {
		
		String maxName = "";
		int maxScore = -1;
		for(VideoGame v: games) {
			
			if(v.getReviewScore() > maxScore) {
				maxScore = v.getReviewScore();
				maxName = v.getName();
			}
			
		}
		System.out.println("The highest rated video game is: " + maxName);
		System.out.println("The highest rated video game score is: " + maxScore);
	}
	
}
