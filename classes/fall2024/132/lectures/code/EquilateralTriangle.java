
public class EquilateralTriangle implements Shape {
	
	private double side_length;
	
	public EquilateralTriangle(double side_length) {
		this.side_length = side_length;
	}
	@Override
	public double area() {
		double answer = (Math.sqrt(3)/4) * Math.pow(side_length, 2);
		return answer;
	}

	@Override
	public double perimeter() {
		return side_length * 3;
	}

}
