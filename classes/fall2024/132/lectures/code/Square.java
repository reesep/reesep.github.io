
public class Square implements Shape{
	
	private double side_length;
	
	public Square(double side_length) {
		this.side_length = side_length;
	}
	
	@Override
	public double area() {
		double answer = Math.pow(side_length, 2);
		return answer;
	}

	@Override
	public double perimeter() {
		double answer = side_length * 4;
		return answer;
	}

}
