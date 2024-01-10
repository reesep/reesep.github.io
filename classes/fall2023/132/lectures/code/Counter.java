
import java.util.Random;

public class Counter {

	private int total;
	
	public Counter() {
		this.total = 0;
	}
	
	public void increase() {
		Random random = new Random();
		int random_num = random.nextInt(20);
		System.out.println("Rolled a " + random_num);
		this.total += random_num;
	}
	
	public int getTotal() {
		return this.total;
	}
}