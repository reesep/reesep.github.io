
public class TeachingAssistant extends Professor{

	private double gpa;
	
	public TeachingAssistant(String n, int i, int s, String c, double g) {
		super(n, i, s, c);
		this.gpa = g;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void testMethod() {
		System.out.println("#3 TeachingAssistant Class");
	}
	
}
