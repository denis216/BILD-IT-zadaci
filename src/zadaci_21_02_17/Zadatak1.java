package zadaci_21_02_17;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//Importujemo scanner
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite ukupan iznos racuna");
				double racun = input.nextDouble();
				// Racun ne moze biti 0 zato sto ako smo usli u restoran nesto
				// smo morali pojesti ili popiti :D
				while (racun <= 0) {
					System.out.println("Unesite iznos racuna veci od 0: ");
					racun = input.nextDouble();
				}
				System.out.println("Unesite procenat napojnice");
				double napojnica = input.nextDouble();
				while (napojnica < 0) {
					System.out.println(
							"Iznos napojnice ne moze biti negativan.Pokusajte ponovo unjeti procenat napojnice:");
					napojnica = input.nextDouble();
				}
				// Varijabla za dobijanje iznosa napojnice
				double iznosNpojnice = racun * (napojnica / 100);
				// Varijabla za dobijanje ukupnog racuna (racun+napojnica)
				double ukupno = racun + iznosNpojnice;
				System.out
						.println("Ukupan iznos za uplatu je " + ukupno + " KM a napojnica je " + iznosNpojnice + " KM");
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}
}
