
public class Triangle implements RegularPolygon {

	private double sideLength;
	
	public Triangle(double sideLength) {
		this.sideLength = sideLength;
	}
	
	@Override
	public double area() {
		double answer = (Math.sqrt(3) / 4) * (sideLength * sideLength);
		return answer;
	}

	@Override
	public double perimeter() {
		return sideLength * 3;
	}

	
	
}
