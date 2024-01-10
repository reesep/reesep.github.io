
public class Patient implements Comparable<Patient>{

	private String name;
	private int age;
	
	public Patient(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public int compareTo(Patient other) {

		if(this.age > other.age) {
			return -1;
		}
		else if(this.age < other.age) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
}
