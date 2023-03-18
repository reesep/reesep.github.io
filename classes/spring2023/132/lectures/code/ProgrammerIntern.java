
public class ProgrammerIntern extends Programmer{

	private String school;
	
	public ProgrammerIntern(String name, int id, int salary, String language, String school) {
		super(name,id,salary,language);
		this.school = school;
	}
	
	public String getSchool() {
		return this.school;
	}
	
	public String getName() {
		return this.name + " (student)";
	}

}
