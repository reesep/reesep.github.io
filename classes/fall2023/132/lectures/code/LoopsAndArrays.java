import java.util.Arrays;

public class LoopsAndArrays {

	public static void main(String[] args) {
		
		int[] test_scores = {99, 81, 65, 46};
		
		test_scores[1] = 85;
		
		//System.out.println(test_scores[1]);
		
		String[] friends = new String[5];
		friends[0] = "Susan";
		friends[1] = "Spencer";
		System.out.println(friends);
		
		System.out.println(Arrays.toString(friends));
		
		String[] animals = {"Zebra", "Elephant", "Lion", "Penguin"};
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		for(String a: animals) {
			System.out.println(a);
		}

	}

}
