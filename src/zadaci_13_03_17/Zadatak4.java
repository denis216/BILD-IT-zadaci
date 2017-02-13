package zadaci_13_03_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Importujemo skener
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				// Pravimo niz koji ce sadrzavati 10 brojeva
				int broj[] = new int[10];
				//Prolazimo kroz petlju i unosimo brojeve u niz
				System.out.println("Unesite 10 cijelih brojeva:");
				for (int i = 0; i < broj.length; i++) {
					broj[i] = input.nextInt();
				}
				//Printamo od poslednjeg indexa do 0
				System.out.println("Uneseni brojevi u obrnutom redosledu su:");
				for (int i = broj.length - 1; i >= 0; i--) {
					System.out.print(broj[i] + " ");
				}
				break;

			} catch (Exception e) {
				System.out.println("Unijeli ste znak ili slovo.");
				input.nextLine();
			}
		}

	}

}
