
public abstract class Employee {

	protected String name;
	protected int emp_id;
	protected int salary;
	
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.emp_id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.emp_id;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void testFunction() {
		System.out.println("I am in inside the Employee class!!");
	}
	
}