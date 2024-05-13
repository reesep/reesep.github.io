
public class EmployeeDemo {

	public static void main(String[] args) {
		
		
		Programmer p = new Programmer("Reese",12345,80000,"Python");
		
		Salesperson s = new Salesperson("Dwight",56789,65000,2000);
		
		Lawyer l = new Lawyer("Kim Wexler",01010,120000,'A');
		
		ProgrammerIntern pi = new ProgrammerIntern("Steve",55555,25000,"Java","MSU");
		
		// Abstract Class--> we cannot create an employee class
		//Employee e = new Employee("Mr. Employee",1111,20);
		
		System.out.println(s.getCommmision());
		
		System.out.println(pi.getName());

				
		p.testMethod();
		
	}

}
