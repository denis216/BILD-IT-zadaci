package zadaci_02_03_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntersectionPointTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 0.0;
		double y2 = 0.0;
		double x3 = 0.0;
		double y3 = 0.0;
		double x4 = 0.0;
		double y4 = 0.0;

		while (true) {

			try {

				System.out.println("Unesite x1");
				x1 = input.nextDouble();
				while (x1 < -100 || x1 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite x1");
					x1 = input.nextDouble();
				}					

				System.out.println("Unesite y1");
				y1 = input.nextDouble();
				while (y1 < -100 || y1 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite y1");
					y1 = input.nextDouble();
				}

				System.out.println("Unesite x2");
				x2 = input.nextDouble();
				while (x2 < -100 || x2 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite x2");
					x2 = input.nextDouble();
				}

				System.out.println("Unesite y2");
				y2 = input.nextDouble();
				while (y2 < -100 || y2 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite y2");
					y2 = input.nextDouble();
				}

				System.out.println("Unesite x3");
				x3 = input.nextDouble();
				while (x3 < -100 || x3 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite x3");
					x3 = input.nextDouble();
				}


				System.out.println("Unesite y3");
				y3 = input.nextDouble();
				while (y3 < -100 || y3 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite y3");
					y3 = input.nextDouble();
				}


				System.out.println("Unesite x4");
				x4 = input.nextDouble();
				while (x4 < -100 || x4 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite x4");
					x4 = input.nextDouble();
				}

				System.out.println("Unesite y4");
				y4 = input.nextDouble();
				while (y4 < -100 || y4 > 100) {
					System.out.println("Pogresan unos!!! Pokusajte ponovo.");
					System.out.println("Unesite y4");
					y4 = input.nextDouble();
				}
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos!!! Pokusajte ponovo iz pocetka!: ");
				input.nextLine();
			}
		}

		LinearEquation linEq = new LinearEquation();
		IntersectionPoint point = new IntersectionPoint();

		linEq = point.getIntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);

		if (linEq.isSolvable()) {
			System.out.println("Isprepletena tacka je na (" + linEq.getX() + ", " + linEq.getY() + ")");
		} else {
			System.out.println("Dvije linije su paralelne...");
		}

	}

}
