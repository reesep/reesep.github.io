
public class StudentDemo {

	public static void main(String[] args) {
		
		double[] scores = {75.0, 60.0, 90.0};
		
		
		Student student1 = new Student("Charles","Computer Science",30,1.0,scores);
		student1.determineYear();
		student1.printSummary();
		boolean answer = student1.checkForRegistration();
		System.out.println(answer);
		/*
		System.out.println(student1.getMajor());
		student1.changeMajor("Chemistry");
		System.out.println(student1.getMajor());
		student1.checkForProbation();
		student1.determineYear();
		System.out.println(student1.getYear());
		student1.calculateAverage();
		*/
	}

}
