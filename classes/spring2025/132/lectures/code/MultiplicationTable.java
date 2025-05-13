import java.util.Arrays;

public class MultiplicationTable {

	private int[][] table;
	
	public MultiplicationTable(int size) {
		this.table = fillTable(size);
	}
	
	public int[][] fillTable(int size){
		
		int[][] temp = new int[size][size];
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				temp[i][j] = (i+1) * (j+1);
			}
			
		}
	
		return temp;
	}
	
	
	public void printTable() {
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table.length; j++) {
				System.out.printf("%5s", table[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
}
