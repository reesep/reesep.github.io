
public class Square implements RegularPolygon{

	private double side_length;
	
	public Square(double s) {
		this.side_length = s;
	}
	
	@Override
	public double area() {
		double answer = side_length * side_length;
		return answer;
	}

	@Override
	public double perimeter() {
		double answer = side_length * 4;
		return answer;
	}

}
