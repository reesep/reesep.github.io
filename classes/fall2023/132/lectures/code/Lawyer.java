
public class Lawyer extends Employee{
	
	private int bar_id;
	
	public Lawyer(String name, int i, int s, int b) {
		super(name, i, s);
		this.bar_id = b;
	}

	public int getBarID() {
		return this.bar_id;
	}
}
