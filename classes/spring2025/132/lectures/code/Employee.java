
public abstract class Employee {

	protected String name;
	protected int id;
	protected int salary;
	
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.id;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void testMethod() {
		System.out.println("#1 Employee Class");
	}
}
