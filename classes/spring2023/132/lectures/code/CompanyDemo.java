
public class CompanyDemo {

	public static void main(String[] args) {
		

		Salesperson jim = new Salesperson("Jim Halpert", 8080, 65000, 15000);
		Salesperson dwight = new Salesperson("Dwight Schrute", 5544, 65000, 21000);
		
		System.out.println(jim.getName());
		System.out.println(jim.getID());
		System.out.println(jim.getSalary());
		System.out.println(jim.getCommission());
		
		Programmer reese = new Programmer("Reese Pearsall", 1234, 90000, "Python");
		
		System.out.println(reese.getName());
		System.out.println(reese.getID());
		System.out.println(reese.getSalary());
		System.out.println(reese.getLanguage());
		
		Accountant kevin = new Accountant("Kevin Malone", 4444, 42000, 'C');
		
		System.out.println(kevin.getName());
		System.out.println(kevin.getID());
		System.out.println(kevin.getSalary());
		System.out.println(kevin.getCpaGrade());
		
		ProgrammerIntern stew = new ProgrammerIntern("Stew",1111,0,"Java","MSU");
		System.out.println(stew.getName());
		
		Employee e = new Employee("Ron",5555,60000);
		System.out.println(e.getName());
		
	}

}
