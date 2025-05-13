
public class Pentagon implements RegularPolygon{

	private double sideLength;
	
	public Pentagon(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double area() {
		double answer = (1.0/4.0) * (Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * (sideLength * sideLength);
		return answer;
	}

	@Override
	public double perimeter() {
		return sideLength * 5;
	}
	
	
}
