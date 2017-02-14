package zadaci_14_02_17;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pocetnaGod = 0;
		int krajnjaGod = 0;
		while (true) {
			try {
				System.out.println("Unesite pocetnu godinu: ");
				pocetnaGod = input.nextInt();
				System.out.println("Unesite krajnju godinu: ");
				krajnjaGod = input.nextInt();
				// Ako je pocetna godina veca od krajnje da ponavlja sve dok se ne unese pravilno
				while (pocetnaGod >= krajnjaGod) {
					System.out.println(
							"Pocetna godina mora biti manja od krajnje.Pokusajte ponovo \nUnesite krajnju godinu");
					krajnjaGod = input.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos!!! Pokusajte ponovo");
				input.nextLine();
			}

		}
		int brojac = 0;
		// Polazimo od pocetne godine do krajnje i provjeravamo za svaku godinu
		// da li je prestupna
		for (int i = pocetnaGod; i <= krajnjaGod; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				System.out.print(i + " ");
				brojac++;
				//Ako je brojac jednak 10 prelazi u novi red i resetuje brojac
			} else if (brojac == 10) {
				System.out.println();
				brojac = 0;
			}

		}

	}

}
