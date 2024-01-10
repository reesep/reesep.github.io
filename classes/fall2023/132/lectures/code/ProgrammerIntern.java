
public class ProgrammerIntern extends Programmer {

	private String school;
	
	public ProgrammerIntern(String name, int id, int salary, String lan, String school) {
		super(name, id, salary, lan);
		this.school = school;
	}
	
	public String getSchool() {
		return this.school;
	}
	
	//public String getName() {
		//return this.name + "(Student)";
	//}
	
}
