package jan25;

public class Student {

	private String name;
	private String major;
	private int num_of_credits;
	private double gpa;
	private String year;
	
	public Student(String name, String major, int num_of_credits, double gpa){
	
		this.name = name;
		this.major = major;
		this.num_of_credits = num_of_credits;
		this.gpa = gpa;
		this.year = "Unknown";
	}
		
	public String getName() {
		return this.name;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void printSummary() {
		System.out.println("Name: "+ this.name);
		System.out.println("Major: "+ this.major);
		System.out.println("Credits: "+ this.num_of_credits);
		System.out.println("GPA: "+ this.gpa);
		System.out.println("Year: "+ this.year);
	}
	
	public void changeMajor(String newMajor) {
		this.major = newMajor;
	}
	
	public void checkForProbation() {
		if(this.gpa > 2.0) {
			System.out.println("Student is in good standing");
		}
		else if(this.gpa == 2.0) {
			System.out.println("Student is borderline probation");
		}
		else {
			System.out.println("Student needs to go on probation");
		}
	}
	
	
	public void determineYear() {
		
		if(this.num_of_credits >= 0 && this.num_of_credits <= 30) {
			this.year = "Freshman";
		}
		else if(this.num_of_credits > 30 && this.num_of_credits <= 60) {
			this.year = "Sophomore";
		}
		else if(this.num_of_credits > 60 && this.num_of_credits <= 90) {
			this.year = "Junior";
		}
		else if(this.num_of_credits > 90 && this.num_of_credits <= 120) {
			this.year = "Senior";
		}
		else {
			this.year = "Super Senior";
		}
	}
	
}
