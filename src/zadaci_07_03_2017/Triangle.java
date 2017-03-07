package zadaci_07_03_2017;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	// No args constructor
	public Triangle() {
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// Returning perimiter of triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// method for finding area of triangle
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
	}
}
