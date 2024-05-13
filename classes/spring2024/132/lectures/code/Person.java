
public class Person {

	private String name;
	private int age;
	
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
}

