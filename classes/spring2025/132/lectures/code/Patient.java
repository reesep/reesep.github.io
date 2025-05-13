
public class Patient implements Comparable<Patient>{

	private String name;
	private int age;
	
	public Patient(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public String getInfo() {
		return name + "(" + age + ")";
	}

	@Override
	public int compareTo(Patient other) {
		//tell java how to sort Patient objects ("our priority")
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
