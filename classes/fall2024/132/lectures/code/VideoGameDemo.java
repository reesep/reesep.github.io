import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class VideoGameDemo {

	public static void main(String[] args) {
		
		VideoGame[] listOfGames;
		
		listOfGames = readFile();
		
		VideoGameAnalysis v1 = new VideoGameAnalysis(listOfGames);
		//v1.printAlphabetically();
		v1.findHighestGame();
	}
	
	public static VideoGame[] readFile() {
	
		VideoGame[] games = new VideoGame[1211];
		
		try {
			FileReader file = new FileReader("video_games.csv");
			Scanner input_file = new Scanner(file);
			
			//discard column headers
			input_file.nextLine();
			
			//array index
			int i = 0;
			
			while(input_file.hasNext()) {
				
				String line = input_file.nextLine();
				String[] splitted_line = line.split(",");
				String name = splitted_line[0];
				int num_of_players = Integer.parseInt(splitted_line[2]);
				int year = Integer.parseInt(splitted_line[13]);
				int review = Integer.parseInt(splitted_line[7]);
				
				VideoGame v = new VideoGame(name, year, review, num_of_players);
				games[i] = v;
				i++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return games;
	}

	
	
	
	
	
	
	
	
}
