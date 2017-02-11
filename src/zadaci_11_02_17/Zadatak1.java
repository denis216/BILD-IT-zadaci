package zadaci_11_02_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Pravimo skener i uzimamo unos od korisnika
		Scanner input = new Scanner(System.in);
		int broj = 0;
		int divider = 2;
		System.out.println("Unesite pozitivan broj:");
		while (true) {

			try {
				broj = input.nextInt();
				while (broj <= 0) {
					System.out.print("Molimo unesite pozitivan broj veci od nule: ");
					broj = input.nextInt();
				}
				System.out.println("Faktori broja " + broj + " su:");
				// Pronalazimo faktore broja
				while (broj != 1) {
					while (broj % divider == 0) {
						System.out.print(divider);
						System.out.print(" ");
						broj /= divider;
						if (broj % divider != 0)
							divider++;
					}
					divider++;
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Unijeli ste slovo ili znak. Unesite broj: ");
				input.nextLine();
			}
		}
	}
}
