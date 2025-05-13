import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class VideoGameDemo {

	public static void main(String[] args) {
		
		VideoGame[] games;
		
		games = readFromFile();
		
		VideoGameAnalysis vga = new VideoGameAnalysis(games);
		vga.findHighestGame();
		vga.printAlphabetically();

	}
	
	public static VideoGame[] readFromFile(){
		
		VideoGame[] gamesFromFiles = new VideoGame[1211];
		
		FileReader file;
		try {
			file = new FileReader("video_games.csv");
			Scanner input = new Scanner(file);
			
			//discard the column headers
			input.nextLine();
			int i = 0;
			while(input.hasNext()) {
				
				String line = input.nextLine();
				String[] splitted_line = line.split(",");
				
				String name = splitted_line[0];
				int players = Integer.parseInt(splitted_line[2]);
				int rating =  Integer.parseInt(splitted_line[7]);
				
				VideoGame v = new VideoGame(name, players, rating);
				
				gamesFromFiles[i] = v;
				i++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return gamesFromFiles;
	}

}
