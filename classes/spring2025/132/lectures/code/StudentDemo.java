
public class StudentDemo {

	public static void main(String[] args) {
		
		double[] s1_scores = {30.0, 45.0, 15.6, 47.0, 60.0, 50.0 , 67.2};
		Student student1 = new Student("Reese", "Computer Science",3.5,95, s1_scores);
		
		double[] s2_scores = {99.1, 87.4, 75.0};
		Student student2 = new Student("Susan", "Math", 4.0, 31, s2_scores);
		
		double[] s3_scores = {89.9, 95.4, 99.999, 41.0};
		Student student3 = new Student("Jack", "Chemistry", 1.9, 81, s3_scores);
		
		Student[] students = { student1, student2, student3 };
		for(Student s: students) {
			s.checkForProbation();
		}
		
		
		//System.out.println(student1.getName());
		//System.out.println(student1.getMajor());
		//System.out.println(student1.getGPA());
		//System.out.println(student1.getCredits());
		
		double avg = student1.calculateAverageScore();
		System.out.println(avg);
		
		double lowest = student1.findLowestGrade();
		System.out.println(lowest);
		
		/*
		student1.printSummary();
		
		student1.changeMajor("Math");
		student1.determineYear();
		
		student1.printSummary();
		
		student3.checkForProbation();
		
		student1.checkForRegistration();
		student3.checkForRegistration();
		*/
		
		
		// Arrays and For Loops Demo
		//------------------------------------------------
		/*
		String[] array = { "Yellow", "Red", "Blue" };
		
		String[] array2 = new String[10];
	
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(String color: array) {
			System.out.println(color);
		}
		*/
		
		
		
		
		
		
		
		
		
	}

}
