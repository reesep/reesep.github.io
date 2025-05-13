
public class ThrowingExceptions {

	public static void main(String[] args) {
		foo();
	}
	
	public static void foo() {	
		try {
			bar();
		}
		catch(Exception e) {
			System.out.println("Error caught!");
		}
	}
	
	public static void bar() throws NullPointerException {
		throw new NullPointerException("Null pointer exception detected!");
	}

}
