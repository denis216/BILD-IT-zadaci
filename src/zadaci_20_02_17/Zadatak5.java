package zadaci_20_02_17;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Niz koji nam sluzi za brojanje koliko je puta neki broj unesen
		int[] counter = new int[100];
		while (true) {
			try {
				System.out.println("Unesite cijele brojeve u raspono od 1 do 100. Nula (0) prekida unos");
				ArrayList<Integer> list = new ArrayList<>();
				while (true) {

					int broj = input.nextInt();
					if (broj == 0)
						break;
					else if (broj < 1 || broj > 100) {
						System.out.println("Unesite broj u rasponu od 1 do 100");
						broj = input.nextInt();
					}
					list.add(broj);
					counter[broj]++;

				}
				break;

			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}

		// Ispis
		for (int i = 0; i < counter.length; i++) {
			// Ispis brojeva koji su se pojavili
			if (counter[i] != 0) {
				System.out
						.println("Broj " + i + " se pojavljuje " + counter[i] + (counter[i] == 1 ? " put." : " puta."));
			}
		}
	}
}