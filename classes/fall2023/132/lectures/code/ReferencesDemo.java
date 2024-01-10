
public class ReferencesDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Bob",40);
		Person p2 = new Person("Sally",27);
		Person p3 = p1;
		
		System.out.println(p1.getName());
		System.out.println(p3.getName());
		
		p3.setName("Jack");
		
		System.out.println(p3.getName());
		System.out.println(p1.getName());
	}

}
