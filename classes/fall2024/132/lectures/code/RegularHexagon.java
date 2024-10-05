
public class RegularHexagon implements Shape{

	private double side_length;
	
	public RegularHexagon(double side_length) {
		this.side_length = side_length;
	}
	
	@Override
	public double area() {
		double answer = (3 * Math.sqrt(3/ 2) * Math.pow(side_length, 2));
		return answer;
	}

	@Override
	public double perimeter() {
		return side_length * 6;
	}

}
