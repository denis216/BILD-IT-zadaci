package zadaci_20_02_17;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int najManji = 1;
		int najVeci = 1;
		while (true) {
			try {
				System.out.print("Unesite prvi cijeli pozitivan broj: ");
				int prviBroj = input.nextInt();
				// Ako je uneseni broj manji ili jednak nuli da ponovimo unos
				while (prviBroj <= 0) {
					System.out.println("Broj mora biti pozitivan.Pokusajte ponovo");
					prviBroj = input.nextInt();
				}
				System.out.print("Unesite drugi cijeli pozitivan broj: ");
				int drugiBroj = input.nextInt();
				// Ako je uneseni broj manji ili jednak nuli da ponovimo unos
				while (drugiBroj <= 0) {
					System.out.println("Broj mora biti pozitivan.Pokusajte ponovo");
					drugiBroj = input.nextInt();
				}
				// Dobijamo najmanji od dva broja
				int pocetak = Math.min(prviBroj, drugiBroj);
				// Petljom proci kroz raspon brojeva
				for (int i = pocetak; i > 1; i--) {
					if (prviBroj % i == 0 && drugiBroj % i == 0) {
						najManji = i;

					}
				}
				// Petljom proci kroz raspon brojeva
				System.out.println("Najmanji zajednicki djelilac je " + najManji);
				for (int i = pocetak; i > 1; i--) {
					if (prviBroj % i == 0 && drugiBroj % i == 0) {
						najVeci = i;
						break;
					}
				}
				System.out.println("Najveci zajednicli djelilac je " + najVeci);
				break;
			} catch (Exception e) {
				System.out.println("Greska ! Molimo unesite cijele brojeve.");
				input.nextLine();
			}
		}
	}

}
