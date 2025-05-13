
public class Programmer extends Employee{
	
	private String language;
	
	public Programmer(String n, int i, int s, String l) {
		super(n, i, s);
		this.language = l;
	}
	
	
	public String getLanguage() {
		return this.language;
	}
	
	
}
