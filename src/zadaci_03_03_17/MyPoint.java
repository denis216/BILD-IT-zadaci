package zadaci_03_03_17;

public class MyPoint {
	double x;
	double y;

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// getter methods
	public double getX() {
		return x;
	}

	// getter methods
	public double getY() {
		return y;
	}

	// method that returns distance between MyPoint object that called the
	// method and MyPoint object that was passed as parameter
	public double distance(MyPoint point) {
		return distance(point.x, point.y);
	}

	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

	}

}
