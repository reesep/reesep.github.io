import java.util.Arrays;
public class ArraysAndLoops {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50, 60 };
		
		System.out.println(Arrays.toString(numbers));
		
		String[] names = new String[10];
		names[5] = "Jeff";
		System.out.println(names[5]);
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for(Integer i: numbers) {
			System.out.println(i);
		}
		

	}

}
