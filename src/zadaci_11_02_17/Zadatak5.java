package zadaci_11_02_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Pravimo skener i uzimamo unos od korisnika
		Scanner input = new Scanner(System.in);

		int array[] = new int[100];
		int suma = 0, prosjek = 0, iznadProsjeka = 0, ispodProsjeka = 0, brojac = 0, jednak = 0;

		/*
		 * Punimo niz i postavljamo uslov da 0 prekida unos,racunamo sumu i
		 * brojimo koliko je unosa bilo
		 */
		while (true) {
			try {
				System.out.println("Molimo unesite vase brojeve, 0 prekida unos: ");
				for (int i = 0; i <= array.length; i++) {
					array[i] = input.nextInt();
					if (array[i] == 0)
						break;
					brojac++;
					suma += array[i];
				}
				// Racunamo prosek
				prosjek = suma / brojac;
				/*
				 * Prolazimo kroz petlju i racunamo koliko je iznad,ispod i
				 * jednakih brojeva datom proseku
				 */
				for (int i = 0; i < brojac; i++) {
					if (array[i] > prosjek) {
						iznadProsjeka++;
					} else if (array[i] == prosjek) {
						jednak++;
					} else {
						ispodProsjeka++;
					}
				}
				System.out.println("Suma svih unesenih brojeva do sad je " + suma);
				System.out.println("Brojeva iznad proseka je: " + iznadProsjeka);
				System.out.println("Brojeva ispod prosjeka je: " + ispodProsjeka);
				System.out.println("Brojeva jednako prosjeku je: " + jednak);
				break;
			}

			catch (InputMismatchException e) {
				System.out.println(
						"Nemoguc unos! Dozvoljen je unos samo brojeva a vi se unjeli nesto sto nije broj.Pokusaj ponovo");
				input.nextLine();
			}
		}
	}
}