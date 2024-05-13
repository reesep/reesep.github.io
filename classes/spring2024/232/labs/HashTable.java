import java.util.Random;

public class HashTable {

	// You are welcome to make changes to this class, but you should not remove any of the existing code.

	private Integer[] data;
	private String[] collisions;
	
	public HashTable(int size) {
		this.data = new Integer[size];
		this.collisions = new String[size];
		for(int i = 0; i < collisions.length; i++) {
			collisions[i] = "";
		}
	}
	
	public int hash(int i) {
		return i % data.length;
	}
	
	public void insert(int newEntry) {
		//TO DO: Lab 6
		//Must use linear probing to handle collisions
		
	}

	public void printHashTable() {
		//TO DO: Lab 6

	}

	public void insertRandomValues(int n) {
		//TO DO: Lab 6

	}


	public void printCollisionTable() {
		//TO DO: Lab 6
		
	}


	public int get(int search) {
		//TO DO: Lab 6

	}

}
