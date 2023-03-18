package jan25;

public class StudentDemo {

	public static void main(String[] args) {
		// Name, Major, Number of Credits, Gpa, Year

		double[] exam_scores = {75.0, 88.0, 91.0,1.0,0.5};
		
		Student student1 = new Student("Charles","Computer Science",95,3.0,exam_scores);
		
		System.out.println(student1.getName());
		System.out.println(student1.getGPA());
		
		student1.printSummary();
		
		student1.changeMajor("Math");
		
		student1.printSummary();
		
		student1.checkForProbation();
		
		student1.determineYear();
		student1.printSummary();
		
		// A student is allowed to register for CSCI 476
		// If they have a GPA of >= 2.0 AND
		// A junior or a senior
		student1.checkForRegistration();
		
		System.out.println(student1.calculateAverageScore());
		
		System.out.println(student1.findLowestGrade());
		
	}

}
