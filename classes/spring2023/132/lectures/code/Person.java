
public class Person {
	
	private String name;
	private int age;
	
	// constructor
	public Person(String inName, int inAge) {
		this.name = inName;
		this.age = inAge;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}


}
