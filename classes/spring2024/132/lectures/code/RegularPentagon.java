
public class RegularPentagon implements RegularPolygon {

	private double side_length;
	
	public RegularPentagon(double s) {
		this.side_length = s;
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5))))) * (this.side_length * this.side_length) / 4;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return side_length * 5;
	}

}
