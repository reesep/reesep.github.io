
public class Salesperson extends Employee{

	private int commision;
	
	public Salesperson(String name, int id, int sal, int com) {
		super(name, id, sal);
		this.commision = com;
	}
	
	public int getCommission() {
		return this.commision;
	}
	
	
	
	
}