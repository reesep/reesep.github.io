import java.util.Arrays;

public class LoopsAndArrays {

	public static void main(String[] args) {
		
		int[] exams = {81, 99, 65, 46};
		System.out.println(exams[3]);
		exams[3] = 80;
		System.out.println(exams[3]);
		
		//String[] names = {"Reese", "Sally", 132, "Susan"};
		
		String[] animals = new String[5];
		System.out.println(animals[1]);
		animals[1] = "Zebra";
		animals[3] = "Penguin";
		System.out.println(animals);
		System.out.println(Arrays.toString(animals));
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		for(String s: animals) {
			System.out.println(s);
		}
		

	}

}
