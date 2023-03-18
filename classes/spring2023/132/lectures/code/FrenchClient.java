
public class FrenchClient implements ClientMethods{

	@Override
	public void greet() {
		System.out.println("Bonjour");
	}

	@Override
	public void goodbye() {
		System.out.println("au revoir");
	}

}
