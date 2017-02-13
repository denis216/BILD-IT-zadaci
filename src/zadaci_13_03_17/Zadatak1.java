package zadaci_13_03_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	// Metoda koja provjerava dali je broj negativan.
	public static boolean jeNegativan(double broj) throws Exception {
		if (broj < 0) {
			throw new Exception("NEGATIVAN");
		}
		return true;
	}

	public static void main(String[] args) {
		// Importujemo skener
		Scanner input = new Scanner(System.in);
		// while petlja da nam ponavlja pitanje ukoliko unesemo slovo umjesto
		// broja.
		while (true) {
			try {
				System.out.println("Unesite mjesecni iznos stednje:");
				double mjesecniIznos = input.nextDouble();
				jeNegativan(mjesecniIznos);
				System.out.println("Unesite broj mjeseci:");
				double brojMjeseci = input.nextDouble();
				jeNegativan(brojMjeseci);
				double kamatnaStopa = 0.05 / 12;
				double stanjeRacuna = 0;
				for (int i = 0; i < brojMjeseci; i++) {
					stanjeRacuna = (mjesecniIznos + stanjeRacuna) * (1 + kamatnaStopa);
					System.out.printf("%.3f", stanjeRacuna);
					System.out.println();
				}
				break;

			} catch (Exception e) {
				System.out.println("Unijeli ste slovo ili znak ili negativan broj.Nemoguc unos !");
				System.out.println("Pokusajte ponovo");
				input.nextLine();
			}

		}

	}

}
