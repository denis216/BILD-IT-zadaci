package zadaci_28_02_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row = 0;
		int column = 0;
		//Ensare idem uciti html css da ne gubim vrijeme sa komentarima. :**
		while (true) {
			try {
				System.out.println("Unesite broj redova u nizu");
				row = input.nextInt();
				while (row < 0) {
					System.out.println("Unesite pozitivan broj redova.Dozvoljen unos je samo pozitivnih brojeva: ");
					row = input.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos ! Pokusajte ponovo!");
				input.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("Unesite broj kolona u nizu");
				column = input.nextInt();
				while (column < 0) {
					System.out.println("Unesite pozitivan broj kolona.Dozvoljen unos je samo pozitivnih brojeva: ");
					column = input.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos ! Pokusajte ponovo!");
				input.nextLine();
			}
		}
		double[][] niz = new double[row][column];
		while (true) {
			try {
				System.out.println("Unesite brojeve u vas niz...");
				for (int i = 0; i < niz.length; i++) {
					for (int j = 0; j < niz[i].length; j++) {
						niz[i][j] = input.nextDouble();
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos ! Pokusajte ponovo!");
				input.nextLine();
			}
		}
		//Instanciramo tj kreiramo objekat
		Location max = new Location(niz);
		System.out.println(
				"Lokacija najveceg elementa je " + max.max + " u " + max.row + " redu i " + max.column + " koloni.");

	}
}
