
// You can import other things, but you must use the libraries imported already
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DocumentChecker {

	
	private HashMap<String,Integer> wordCount;
	private HashSet<String> words;
	
	
	public DocumentChecker(String filename) {
		wordCount = loadHashMap(filename); //TO DO: Part 2
		words = loadHashSet();  //TO DO: Part 1
	}
	
	public HashMap<String,Integer> loadHashMap(String filename){
	   	
	}
	
	
	public HashSet<String> loadHashSet(){
		
	}
	
	public void spellcheck() {
	    //TO DO: Part 3
	}
	
	public void wordCountAlphabetically() {
	    //TO DO: Part 4	
	}

	
	public void wordCountByFrequency() {
	    //TO DO: Part 5
	} 
	
	
	// You are welcome to add more methods if you'd like.
	
	
	
	
	
}
