import java.util.Arrays;
import java.util.Collections;

public class VideoGameAnalysis {

	private VideoGame[] games;
	
	public VideoGameAnalysis(VideoGame[] games) {
		this.games = games;
	}
	
	public void findHighestGame() {
		
		int maxScore = -1;
		String maxName = "";
		for(VideoGame v: games) {
			
			if(v.getRating() > maxScore) {
				maxScore = v.getRating();
				maxName = v.getName();
			}
			
		}
		
		System.out.println("The highest review score was " + maxName + " with a score of " + maxScore);
	}

	public void printAlphabetically() {
		
		String[] onlyNames = new String[1211];
		int i = 0;
		for(VideoGame v: games) {
			onlyNames[i] = v.getName();
			i++;
		}
		
		Arrays.sort(onlyNames);
		
		for(int j = 0; j < onlyNames.length; j++) {
			System.out.println(j + ": " + onlyNames[j]);
		}
		
		
	}
	
}
