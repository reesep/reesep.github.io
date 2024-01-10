
public class Student {

	private String name;
	private String major;
	private int num_of_credits;
	private double gpa;
	private String year;
	private double[] exam_scores;
	
	public Student(String name, String major, int credits, double gpa, double[] exam_scores) {
		this.name = name;
		this.major = major;
		this.num_of_credits = credits;
		this.gpa = gpa;
		this.year = "Unknown";
		this.exam_scores = exam_scores;
	}
	
	public void printSummary() {
		System.out.println("Name: " + this.name);
		System.out.println("Major: " + this.major);
		System.out.println("GPA: " + this.gpa);
		System.out.println("Number of Credits: " + this.num_of_credits);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public int getCredits() {
		return this.num_of_credits;
	}
	
	public double getGPA() {
		return this.gpa;
	}

	public void changeMajor(String newMajor) {
		this.major = newMajor;
	}
	
	public void checkForProbation() {
		
		if(this.gpa > 2.0) {
			System.out.println("Student is not on probation");
		}
		else if(this.gpa == 2.0) {
			System.out.println("Student is on borderline probation");
		}
		else {
			System.out.println("Student is on probation");
		}
	}
	
	public void determineYear() {
		if(this.num_of_credits >= 0 && this.num_of_credits < 30) {
			this.year = "Freshman";
		}
		else if(this.num_of_credits >= 30 && this.num_of_credits < 60) {
			this.year = "Sophmore";
		}
		else if(this.num_of_credits >= 60 && this.num_of_credits < 90) {
			this.year = "Junior";
		}
		else if(this.num_of_credits >= 90 && this.num_of_credits <= 120) {
			this.year = "Senior";
		}
	}
	
	public String getYear() {
		return this.year;
	}
	
	public void calculateAverage(){
		
		double sum = 0.0;
		for(double score : this.exam_scores) {
			sum += score;
		}
		double answer = sum / this.exam_scores.length;
		System.out.println(answer);
		
	}

	public boolean checkForRegistration() {

		if(this.num_of_credits >= 60) {
			if(this.year.equals("Junior") || this.year.equals("Senior")) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
	// Student is allowed to register for CSCI 476 if
	// --> they have atleast 60 credits
	// --> Either a junior or senior
	
	
	
}
