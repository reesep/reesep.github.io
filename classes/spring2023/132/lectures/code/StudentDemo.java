package jan25;

public class StudentDemo {

	public static void main(String[] args) {
		// Name, Major, Number of Credits, Gpa, Year

		Student student1 = new Student("Charles","Computer Science",45,3.0);
		//System.out.println(student1.getName());
		//System.out.println(student1.getGPA());
		//student1.printSummary();
		//student1.changeMajor("Math");
		student1.printSummary();
		//student1.checkForProbation();
		student1.determineYear();
		student1.printSummary();
		
	}

}
