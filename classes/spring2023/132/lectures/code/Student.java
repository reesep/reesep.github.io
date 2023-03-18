package jan25;

public class Student {

	// Instance Field / Attributes
	private String name;
	private String major;
	private int num_of_credits;
	private double gpa;
	private String year;
	private double[] exam_scores;
	
	// Constructor
	public Student(String name, String major, int num_of_credits, double gpa, double[] exam_scores){
	
		this.name = name;
		this.major = major;
		this.num_of_credits = num_of_credits;
		this.gpa = gpa;
		this.year = "Unknown";
		this.exam_scores = exam_scores;

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
	
	public void checkForRegistration() {
		
		if(this.gpa >= 2.0) {
			if(this.year.equals("Junior") || this.year.equals("Senior")) {
				
				System.out.println("Student is allowed to register for CSCI 476");
				
			}
			else {
				System.out.println("Denied");
			}
		}
		else {
			System.out.println("Denied");
		}
		
	}
	
	public double calculateAverageScore() {
		double sumOfScore = 0.0;
		for(double i: this.exam_scores) {
			sumOfScore += i;
		}
		double answer = sumOfScore / this.exam_scores.length;
		return answer;
		
	}
	
	public double findLowestGrade() {
		//{75.0, 88.0, 91.0,1.0}
		double current_min = 100;
		for(double i: this.exam_scores) {
			if(i < current_min) {
				current_min = i;
			}
		}
		return current_min;
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
