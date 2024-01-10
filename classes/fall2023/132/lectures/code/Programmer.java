
public class Programmer extends Employee{

	private String programming_language;
	
	public Programmer(String n, int i, int s, String pl) {
		super(n, i, s);
		this.programming_language = pl;
	}
	
	public String getLanguage() {
		return this.programming_language;
	}
	
	
}
