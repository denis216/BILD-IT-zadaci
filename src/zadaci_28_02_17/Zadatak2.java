package zadaci_28_02_17;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println(
						"Unesite vrijednost od 9 brojeva u prvu listu.Dozvoljen je unos i negativnih brojeva: ");
				for (int i = 0; i < array1.length; i++) {
					for (int j = 0; j < array1[i].length; j++) {
						array1[i][j] = input.nextInt();

					}
				}
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos!!! Pokusajte ponovo !");
				input.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println(
						"Unesite vrijednost od 9 brojeva u drugu listu.Dozvoljen je unos i negativnih brojeva: ");
				for (int i = 0; i < array2.length; i++) {
					for (int j = 0; j < array2[i].length; j++) {
						array2[i][j] = input.nextInt();

					}
				}
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos!!! Pokusajte ponovo !");
				input.nextLine();
			}
		}

		if (equals(array1, array2)) {
			System.out.println("Dva niza su striktno indenticna");
		} else {
			System.out.println("Dva niza nisu striktno indenticna");
		}
	}
	//Metoda koja provjerava i u zavist od rezultata vraca true ako su indenticna ili false ako nisu
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
