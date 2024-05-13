
public class Lawyer extends Employee{

	private char barExamGrade;
	
	public Lawyer(String n, int e, int s, char g) {
		super(n, e, s);
		this.barExamGrade = g;
	}
		
	public char getBarGrade() {
		return this.barExamGrade;
	}
	
}
