package zadaci_03_03_17;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(10, 30.5);

		System.out.println("The distance between (" + p1.getX() + ", " + p1.getY() + ") and (" + p2.getX() + ", "
				+ p2.getY() + ") is: " + p1.distance(p2));

	}

}
