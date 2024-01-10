
public class Employee {

	protected String name;
	private int id;
	private int salary;
	
	public Employee(String n, int i, int s) {
		this.name = n;
		this.id = i;
		this.salary = s;
	}
	
	public String getName() {
		return this.name + "(Employee Class)";
	}
	
	public int getID() {
		return this.id;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
}
