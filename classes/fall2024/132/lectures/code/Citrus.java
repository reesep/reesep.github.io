package sept9;

public class Citrus extends Fruit{
	
	private String variety;

	Citrus(String name, int calories, double price, int numSeeds, boolean isTropical, String variety) {
		super(name, calories, price, numSeeds, isTropical);
		// TODO Auto-generated constructor stub
		this.variety = variety;
	}
	
	public String getVariety() {
		return this.variety;
	}
	
//	public void testMethod() {
//		System.out.println("I am in Citrus");
//	}

}
