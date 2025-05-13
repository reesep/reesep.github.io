
public class EmployeeDemo {

	public static void main(String[] args) {
		
		//illegal (Employee is an Abstract Class)
		//Employee e1 = new Employee("Jack", 33333, 50000);
		
		Professor p1 = new Professor("Clem",12345,100000,"ESOF 422",true);
		
		System.out.println(p1.getName());
		
		Advisor a1 = new Advisor("Shane",67890,50000,"1-5PM");
		System.out.println(a1.getName());
		System.out.println(a1.getHours());
		
		Programmer coder = new Programmer("Reese",55555,60000,"Java");
		
		TeachingAssistant ta = new TeachingAssistant("Andras", 00001, 25000,"CSCI 132", 4.0);
		ta.testMethod();
	}

}
