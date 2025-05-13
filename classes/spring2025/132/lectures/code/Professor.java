
public class Professor extends Employee{
	
	private String course;
	private boolean tenure;
	
	//used for Professor objects
	public Professor(String name, int id, int salary, String course, boolean tenure) {
		super(name, id, salary);
		this.course = course;
		this.tenure = tenure;
	}
	
	//used by child class (TeachingAssistant)
	public Professor(String name, int id, int salary, String course) {
		super(name, id, salary);
		this.course = course;
	}
	
	
	public String getCourse() {
		return this.course;
	}
	
	public boolean getTenure() {
		return this.tenure;
	}
	
	public void testMethod() {
		System.out.println("#2 Professor Class");
	}
	
	
	
}
