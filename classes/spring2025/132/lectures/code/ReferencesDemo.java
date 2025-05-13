
public class ReferencesDemo {

	public static void main(String[] args) {
		
		House h1 = new House(3, 2, "Blue");
		House h2 = new House(5, 3, "Red");
		
		House h3 = h2;
		
		System.out.println(h3.getColor());
		System.out.println(h2.getColor());
		
		h2.setColor("Purple");
		
		System.out.println(h3.getColor());
		System.out.println(h2.getColor());
		
	}

}
