
public class ProgrammerIntern extends Programmer{

	private String school;
	
	public ProgrammerIntern(String name, int empid, int salary, String language, String sch) {
		super(name, empid, salary, language);
		this.school = sch;
	}
	
	public String getSchool() {
		return this.school;
	}
	
}
