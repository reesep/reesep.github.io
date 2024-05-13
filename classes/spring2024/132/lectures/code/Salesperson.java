
public class Salesperson extends Employee{

	private int commission;
	
	public Salesperson(String n, int id, int s, int c) {
		super(n, id, s);
		this.commission = c;
	}
	
	public int getCommmision() {
		return this.commission;
	}
	
	
}
