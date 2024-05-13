
public abstract class Employee{

	protected String name;
	protected int employee_id;
	protected int salary;
	
	public Employee(String n, int e, int s) {
		this.name = n;
		this.employee_id = e;
		this.salary = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.employee_id;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void testMethod() {
		System.out.println("I am inside the employee class");
	}
	
	
}
