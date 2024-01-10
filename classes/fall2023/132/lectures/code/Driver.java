
public class Driver {

	public static void main(String[] args) {
		
		EnglishClient c1 = new EnglishClient();
		c1.greet();
		c1.goodbye();

		SpanishClient c2 = new SpanishClient();
		c2.greet();
		c2.goodbye();
		
		FrenchClient c3 = new FrenchClient();
		c3.greet();
		c3.goodbye();
	}

}
