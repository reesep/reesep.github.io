
public class Student {

	private String name;
	private String major;
	private double gpa;
	private int num_of_credits;
	private String year;
	private double[] exam_scores;
	
	public Student(String inName, String inMajor, double inGpa, int inCredits, double[] exam_scores) {
		this.name = inName;
		this.major = inMajor;
		this.gpa = inGpa;
		this.num_of_credits = inCredits;
		this.year = "???";
		this.exam_scores = exam_scores;
	}
	
	public String getName() {
		return this.name;
	}

	public String getMajor() {
		return this.major;
	}

	public double getGPA() {
		return this.gpa;
	}
	
	public int getCredits() {
		return this.num_of_credits;
	}
	
	public void printSummary(){
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.gpa);
		System.out.println(this.num_of_credits);
		System.out.println(this.year);
	}

	public void changeMajor(String newMajor) {
		this.major = newMajor;
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
	
	public void checkForProbation() {
		// < 2.0 is probation
		if(this.gpa > 2.0) {
			System.out.println("Student is in good standing");
		}
		else if(this.gpa == 2.0) {
			System.out.println("Student is borderline on probation");
		}
		else {
			System.out.println("Student is on academic probation");
		}
		
	}
	
	public void checkForRegistration() {
		//CSCI 476
		// Must be a Junior or a Senior
		// AND 
		// Must have gpa > 2.0
		
		if(this.gpa > 2.0) {
			
			if(this.year.equals("Junior") || this.year.equals("Senior")  ) {
				
				System.out.println("They are allowed to register");
			}
			else {
				
				System.out.println("Not allowed to register");
			}
			
		}
		else {
			
			System.out.println("Not allowed to register");
		}
		
	}
	
	public double calculateAverageScore(){
		
		double sumOfScores = 0.0;
		for(double i: this.exam_scores) {
			sumOfScores += i;
		}
		double answer = sumOfScores / this.exam_scores.length;
		return answer;
		
	}

	public double findLowestGrade() {
		
		double current_min = 100;
		for(double grade : this.exam_scores) {
			if(grade < current_min) {
				current_min = grade;
			}
		}
		return current_min;

	}
	
	
}
