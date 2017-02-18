package zadaci_17_02_17;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pocetnaGod = 0;
		int krajnjaGod = 0;

		// Petlja vrti dok korisnik ne unese odgovarajucu vrijednost
		while (true) {
			try {
				System.out.println("Unesite pocetnu godinu: ");
				pocetnaGod = input.nextInt();
				// Ne dozvoljava da pocenta godina bude manja od 0
				while (pocetnaGod < 0) {
					System.out.println("Broj godina ne moze biti manji od nule. Unesite ponovo pocetnu godinu: ");
					pocetnaGod = input.nextInt();
				}
				break;

			} catch (Exception e) {
				System.out.println("Nemoguc unos...Pokusajte ponovo");
				input.nextLine();
			}
		}

		System.out.println();

		// Petlja vrti dok korisnik ne unese odgovarajucu vrijednost
		while (true) {
			try {
				System.out.println("Unesit krajnu godinu: ");
				krajnjaGod = input.nextInt();
				// Ne dozvoljava da krajnja godina bude manja od 0
				while (krajnjaGod < 0) {
					System.out.println("Broj godina ne moze biti manji od nule. Unesite ponovo krajnju godinu: ");
					krajnjaGod = input.nextInt();
				}
				// Ako je krajnja godina vanja od pocetne pita ponovo da se
				// unese krajnja godina
				if (krajnjaGod < pocetnaGod) {
					System.out.println("Molimo vas unesite krajnju godinu tako da bude veca od pocetne: ");
					krajnjaGod = input.nextInt();
				}
				break;

			} catch (Exception e) {
				System.out.println("Nemoguc unos... Pokusajte ponovo");
				input.nextLine();
			}
		}
		input.close();

		// Printamo od pocetne do krajnje godine
		for (int i = pocetnaGod; i <= krajnjaGod; i++) {
			System.out.println("Godina " + i + " ima " + numberOfDayInAYear(i) + " dana");

		}
	}

	// Metoda vraca broj dana u godini
	public static int numberOfDayInAYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return 366;
		} else {
			return 365;
		}
	}

}