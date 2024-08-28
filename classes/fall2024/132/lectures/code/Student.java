
public class Student {

	private String name;
	private double gpa;
	private String major;
	private String year;
	private int num_of_credits;
	private double[] exam_scores;
	
	public Student(String inName, double inGPA, String inMajor, int num_of_credits, double[] exam_scores) {
		this.name = inName;
		this.gpa = inGPA;
		this.major = inMajor;
		this.num_of_credits = num_of_credits;
		this.year = "";
		this.exam_scores = exam_scores;
	}
	
	public String getName() {
		return this.name;
	}

	public double getGPA() {
		return this.gpa;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String getYear() {
		return this.year;
	}
	
	public void setMajor(String newMajor) {
		this.major = newMajor;
	}
	
	public void printStudent() {
		System.out.println("Name: " + this.name);
		System.out.println("GPA: " + this.gpa);
		System.out.println("Major: " + this.major);
	}

	public void checkForProbation() {
		
		//if gpa <= 2.0 --> probation
		//if gpa > 2.0 == good to go
		if(this.gpa <= 2.0) {
			System.out.println("Student: " + this.name + " is on probation.");
		}
		else{
			System.out.println("Student: " + this.name + " is in good standing.");
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
			this.year = "Super senior";
		}
		
	}
	
	//CSCI 476:
	// - A junior or senior
	// AND have a GPA of greater than 2.0
	public void register() {
		
		if(this.gpa >= 2.0) {
			if(this.year.equals("Junior") || this.year.equals("Senior")) {
				System.out.println("Student " + this.name + " is allowed to register.");
			}
			else {
				System.out.println("not allowed");
			}
		}
		else {
			System.out.println("not allowed");
		}
		
	}
	
	public double computeAvgScores() {
		double sum = 0;
		for(double d: this.exam_scores) {
			sum += d;
		}
		double answer = sum / this.exam_scores.length;
		return answer;
		
	}
}
