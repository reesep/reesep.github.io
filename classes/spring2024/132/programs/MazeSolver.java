

// You will likely need to import some stuff up here

public class MazeSolver {

	//2D representation of the maze. The maze will always be 12x12
	private char[][] maze = new char[12][12];
	
	public MazeSolver() {
		//PART 0 (?) TO DO: You likely will need to add some code here
	}
	
	public char[][] loadMaze(String filename){
		//PART 1: Read in the maze from a text file into a 2D char array
	}
	
	
	private void print_maze(char[][] maze2) {
		//PART 2: Print out a 2D character maze 
		
	}

	public void solveMaze() {
		// PART 3: You don't really need to do anything here

		// starting parameters for "maze.txt"
		// If you are using a different maze, you will need to change these four values
		int start_x  = 0;
		int start_y = 2;
		
		int start_hand_x = 0;
		int start_hand_y = 3;
		
		make_move(start_x, start_y, start_hand_x, start_hand_y);
		
	}
	
	public void make_move(int x, int y, int hand_x, int hand_y) {
		// Part 4: Making a single move in the maze 
		// You CANNOT change the arguments to this method
	

		// Part 4.1: Determine direction (north, east, south, west) using the method inputs

		



		// Part 4.1: Make the move (turn right, move forward, turn left) depending on what the hand is touching, and what is in front of the character
		// This is where you will recursively call the make_move() method
		// (lots of if statements here)

		
		
	}
	
	
}
