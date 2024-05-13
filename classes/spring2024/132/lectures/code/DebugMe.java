
public class DebugMe {

	public static void main(String[] args) {
		
		
		
		Counter counter = new Counter();
		
		for(int i = 0; i < 10; i++) {
			
			counter.increase();
			
		}
		
		System.out.println("Final counter total is: " + counter.getTotal());
		
	}
	
	
}