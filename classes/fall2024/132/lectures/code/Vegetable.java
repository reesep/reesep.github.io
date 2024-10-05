package sept9;

public class Vegetable extends Food{

	private String growthSeason;
	private boolean isLeafy;
	
	Public Vegetable(String name, int calories, double price, String growthSeason, boolean isLeafy){
		super(name, calories, price);
		this.growthSeason = growthSeason;
		this.isLeafy = isLeafy;
	}
	
	
	public String getGrowthSeason() {
		return this.growthSeason;
	}
	
	public boolean getIsLeafy() {
		return this.isLeafy;
	}
	
	
	
}
