
import java.util.Arrays;

public class LoopsAndArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {81, 100, 75 };
		
		scores[1] = 55;
	
		
		//System.out.println(scores.length);
		

		String[] names = new String[3];
		
		//System.out.println(Arrays.toString(names));

		
		names[0] = "John";
		names[1] = "Sally";
		names[2] = "Sean";
		
		//System.out.println(Arrays.toString(names));
		
	
		for(int i = 0; i < names.length; i++) {
			System.out.println((i+1) + ". " + names[i]);
		}
		
		int counter = 1;
		for(String i : names) {
			System.out.println(counter + ". " + i);
			counter++;
		}
		
		
		
	}

}
