
public class StudentDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student("Reese", 1.7, "Computer Science");
		Student student2 = new Student("Iliana", 3.8, "Chemistry");
		
		System.out.println(student1.getName());
		System.out.println(student1.getGPA());
		System.out.println(student1.getMajor());
		
		student1.setMajor("Math");
		//System.out.println(student1.getMajor());
		System.out.println();
		student1.printStudent();
		
		student1.checkForProbation();
		
		System.out.println(student2.getMajor());
		student2.printStudent();
		student2.checkForProbation();
	}

}
