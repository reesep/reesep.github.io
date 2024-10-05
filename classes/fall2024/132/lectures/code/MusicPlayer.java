import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicPlayer {

	public static void main(String[] args) {

		File musicFile = new File("music/beethoven.wav");
		
		try {
			
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start(); //play the audio
			
			Scanner s = new Scanner(System.in);
			System.out.println("Press 1 to stop");
			int response = s.nextInt();
			if(response == 1) {
				clip.stop();
			}
			
			
		}catch(Exception e) {
			System.out.println("Error playing music...");
		}
		

	}
}
