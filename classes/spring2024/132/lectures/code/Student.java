
public class Student {

	private String name;
	private String major;
	private int num_of_credits;
	private double gpa;
	private String year; //freshman, sophomore, junior, ...
	private double[] exam_scores;
	
	public String getName() {
		return this.name;
	}
	
	public Student(String n, String m, int c, double g, double[] e) {
		this.name = n;
		this.major = m;
		this.num_of_credits = c;
		this.gpa = g;
		this.year = "Unknown";
		this.exam_scores = e;
	}

	public void changeMajor(String newMajor) {
		this.major = newMajor;
	}

	public String getMajor() {
		return this.major;
	}
	
	public double getGPA() {
		return this.gpa;
	}

	public String getYear() {
		return this.year;
	}
	
	public void printSummary() {
		System.out.println("Name: " + this.name);
		System.out.println("Major: " + this.major);
		System.out.println("GPA: " + this.gpa);
		System.out.println("Number of credits: " + this.num_of_credits);
	}
	
	public void checkForProbation() {
		
		if(this.gpa < 2.0) {
			System.out.println(this.name + " is on probation");
		}
		else if(this.gpa == 2.0) {
			System.out.println(this.name + " is on borderline probation");
		}
		else {
			System.out.println(this.name +" is not on probation");
		}
		
	}
	
	
	public void determineYear() {
		
		if(this.num_of_credits >= 0 && this.num_of_credits <= 30) {
			this.year = "Freshman";
		} 
		else if(this.num_of_credits > 30 &&  this.num_of_credits <= 60) {
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
	
	// If a student wants to register for CSCI 476
	// They must have a GPA greater than 2.0 AND must be a Senior OR Junior
	
	public void checkForRegistration() {
		if(this.gpa > 2.0) {
			if(this.year.equals("Senior") || this.year.equals("Junior")) {
				System.out.println("Student is allowed to register");
			}
			else {
				System.out.println("Student is not allowed to register");
			}
		}
		else {
			System.out.println("Student is not allowed to register");
		}
	}
	
	public double calculateAverage() {
		
		double sum = 0.0;
		for(double score: this.exam_scores) {
			sum += score;
		}
		double answer = sum / this.exam_scores.length;
		return answer;
		
	}
	
	public double findLowestScore() {
		
		double current_min = 101;
		for(double score : this.exam_scores) {
			
			if(score < current_min) {
				current_min = score;
			}
			
		}
		return current_min;
		
	}
	
	
}
