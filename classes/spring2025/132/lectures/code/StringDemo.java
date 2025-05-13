
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Reese";
		String s2 = "Reese";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String o1 = new String("test");
		String o2 = new String("test");
		
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));

	}

}
