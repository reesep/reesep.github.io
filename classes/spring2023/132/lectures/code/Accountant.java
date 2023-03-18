
public class Accountant extends Employee {


	private char cpa_grade;
	
	public Accountant(String name, int id, int salary, char grade) {
		super(name, id, salary);
		this.cpa_grade = grade;
	}

	public char getCpaGrade() {
		return this.cpa_grade;
	}
	
}