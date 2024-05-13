
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] exams1 = {88, 71, 65, 97};
		double[] exams2 = {66, 81, 41, 100};
		
		Student student1 = new Student("Reese","Computer Science",45, 3.5, exams1);
		Student student2 = new Student("Susan","Math",115, 3.0, exams2);

		//System.out.println(student1.getYear());
		//student1.determineYear();
		//student2.determineYear();
		
		//student1.checkForRegistration();
		//student2.checkForRegistration();
		
		System.out.println(student2.calculateAverage());
		System.out.println(student1.findLowestScore());
	}

}
