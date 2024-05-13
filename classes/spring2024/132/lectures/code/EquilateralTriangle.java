
public class EquilateralTriangle implements RegularPolygon {

	private double side_length;
	
	public EquilateralTriangle(double s) {
		this.side_length = s;
	}
	
	
	public double area() {

		double answer = (Math.sqrt(3) / 4) * (side_length * side_length);
		
		return answer;
	}

	@Override
	public double perimeter() {
		return side_length * 3;
	}

}
