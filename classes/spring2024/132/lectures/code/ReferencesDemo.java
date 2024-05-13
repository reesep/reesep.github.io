
public class ReferencesDemo {

	public static void main(String[] args) {
		
		String x = "Hello";
		System.out.println(x.charAt(i));
		
		Person p1 = new Person("Jack",25);
		Person p2 = new Person("Sally", 43);
		
		Person p3 = p2;
		
		System.out.println(p2.getName());
		p2.setName("Ron");
		System.out.println(p3.getName());
	}

}
