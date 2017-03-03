package zadaci_02_03_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		while (true) {
			try {
				System.out.print("Unesite vrednosti za a, b i c: ");
				a = input.nextDouble();
				b = input.nextDouble();
				c = input.nextDouble();
				//Ponavlja pitanje ako je broj < ili >
				while (a < -100 || a > 100 || b < -100 || b > 100 || c < -100 || c > 100) {
					System.out.println("Unesite broj izmedju -100 and 100: ");
					a = input.nextDouble();
					b = input.nextDouble();
					c = input.nextDouble();
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		}
		//Novi obj qu
		QuadraticEquation qu = new QuadraticEquation(a, b, c);

		if (qu.getDiscriminant() > 0) {
			System.out.println("Korijen jedan je: " + qu.getRoot1() + " i korijen dva je: " + qu.getRoot2());
		} else if (qu.getDiscriminant() == 0) {
			System.out.println("Korijen je: " + qu.getRoot1());
		} else {
			System.out.println("Equation nema korijena.");
		}

	}
}
