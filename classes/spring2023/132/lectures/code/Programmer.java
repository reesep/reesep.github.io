
public class Programmer extends Employee {

	private String programming_language;
	
	public Programmer(String name, int id, int salary, String lan) {
		super(name,id,salary);
		this.programming_language = lan;
	}
	
	public String getLanguage() {
		return this.programming_language;
	}
	
	public void testFunction() {
		System.out.println("I am in inside the Programmer class!!");
	}
}