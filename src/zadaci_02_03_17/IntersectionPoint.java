package zadaci_02_03_17;

public class IntersectionPoint {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	
	public LinearEquation getIntersectingPoint(double x1, double y1, double x2, double y2,
			double x3, double y3, double x4, double y4) {

		//Formule
		double a = (y1 - y2);
		double b = (-x1 + x2);
		double c = (y3 - y4);
		double d = (-x3 + x4);
		double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
		double f = -y3 * (x3 - x4) + (y3 - y4) * x3;

		return new LinearEquation(a, b, c, d, e, f);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}
}

