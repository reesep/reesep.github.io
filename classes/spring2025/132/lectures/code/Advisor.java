
public class Advisor extends Employee{
	
	private String advising_hours;
	
	public Advisor(String n, int i, int s, String a) {
		super(n, i, s);
		this.advising_hours = a;
	}
	
	
	public String getHours() {
		return this.advising_hours;
	}
	
	
	
}
