package zadaci_14_02_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean test = true;
		double brzina = 0;
		double ubrzanje = 0;
		// Testiramo unos
		while (true) {
			try {
				while (brzina < 1) {
					System.out.println("Unesite brzinu v:");
					brzina = input.nextDouble();
				}
				while (ubrzanje < 1) {
					System.out.println("Unesite ubrzanje a:");
					ubrzanje = input.nextDouble();

				}
				break;
			} catch (Exception e) {
				System.out.println("Nepravilan unos unesite ponovo:");
				input.nextLine();
			}
		}

		// Ispisujemo rezultat korisniku
		double rezultat = ((brzina * brzina) / (2 * ubrzanje));

		System.out.printf("Duzina piste je: " + "%.3f", rezultat);

	}

}