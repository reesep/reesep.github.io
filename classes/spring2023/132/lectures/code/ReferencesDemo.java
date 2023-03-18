
public class ReferencesDemo {

	public static void main(String[] args) {
		
		
		Person person1 = new Person("Jim Bob", 44);
		
		Person person2 = new Person("Sally", 28);
		
		System.out.println(person1.getName());
		
		Person person3 = person1;
		
		person1 = null;
		
		//System.out.println(person1.getName());
		System.out.println(person3.getName());
		
		
	}

}
