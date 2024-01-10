import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VideoGames {

	public void findMaxScore() {
		
		try {
			FileReader file = new FileReader("video_games.csv");
			
			Scanner inFile = new Scanner(file);
			//discard column headers
			inFile.nextLine();
			
			int max_score = 0;
			String max_name = "";
			while(inFile.hasNext()) {
				
				String line = inFile.nextLine();
				//System.out.println(line);
				
				String[] splitted_line = line.split(",");
				//System.out.println(Arrays.toString(splitted_line));
				int score = Integer.parseInt(splitted_line[7]);
				if(score > max_score) {
					max_score = score;
					max_name = splitted_line[0];
				}
			}
			System.out.println(max_name);
			System.out.println(max_score);
			inFile.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getNumPlayersInfo() {
		
		
		try {
			FileReader file = new FileReader("video_games.csv");
			
			Scanner inFile = new Scanner(file);
			//discard column headers
			inFile.nextLine();
			int[] player_count = new int[10];
			while(inFile.hasNext()) {
				
				String line = inFile.nextLine();
				String[] splitted_line = line.split(",");
				
				int count = Integer.parseInt(splitted_line[2]);
				player_count[count] += 1;
				
			}
			// Write out to a file
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
				writer.write("Player Count | Frequency \n");
				writer.write("---------------------------------- \n");
			
				for(int i = 1; i < player_count.length; i++) {
					if(player_count[i] != 0) {
						writer.write(i + "           " + player_count[i] + "\n");
					}
				}
				writer.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
			inFile.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
