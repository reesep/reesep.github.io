
public class Accountant extends Employee {

	private char cpa_grade;
	
	public Accountant(String n, int i, int s, char g) {
		super(n, i, s);
		this.cpa_grade = g;
	}

	public char getGrade() {
		return this.cpa_grade;
	}
	
}
