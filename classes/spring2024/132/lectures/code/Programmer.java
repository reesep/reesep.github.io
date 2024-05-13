
public class Programmer extends Employee{

	protected String language;
	
	public Programmer(String n, int eid, int s, String l) {
		super(n, eid, s);
		this.language = l;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public void testMethod() {
		System.out.println("I am inside the programmer class");
	}
	
}
