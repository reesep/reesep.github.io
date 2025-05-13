
public class Square implements RegularPolygon{

	private double sideLength;
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double area() {
		return sideLength * sideLength;
	}

	@Override
	public double perimeter() {
		return sideLength * 4;
	}
	
	
}
