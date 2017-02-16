package zadaci_16_02_2017;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Importovanje skenera :)
		Scanner input = new Scanner(System.in);
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 0.0;
		double y2 = 0.0;
		// Izvrsava dok korisnik ne unese odgovarajuce vrijednosti
		while (true) {

			try {
				System.out.print("Unesite koordinate X1 i Y1: ");
				x1 = input.nextDouble();
				y1 = input.nextDouble();
				break;
			} catch (InputMismatchException ex) {
				System.out.println("\nNiste uneli odgovarajuce vrijednosti. Unesite ponovo ! ! ! ");
				input.nextLine();
			}
		}
		// Izvrsava dok korisnik ne unese odgovarajuce vrijednosti
		while (true) {

			try {
				System.out.print("\nUnesite koordinate X2 i Y2: ");
				x2 = input.nextDouble();
				y2 = input.nextDouble();
				break;
			} catch (InputMismatchException ex) {
				System.out.println("\nNiste uneli odgovarajuce vrijednosti. Unesite ponovo ! ! ! ");
				input.nextLine();
			}
		}
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		// Varijabla za prosjecan radius zemlje
		double radius = 6371.01;
		//formula za radius
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		System.out.println("\nGreat circle distance iznosi: " + d + " km");
		
	}
}