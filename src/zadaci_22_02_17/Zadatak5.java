package zadaci_22_02_17;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Petlja vrti dok nije ispunjen uslov
		while (true) {
			try {
				System.out.println("Unesite broj n");
				int brojN = input.nextInt();
				// Pozivamo metodu i prosledjujemo joj unos
				printMatrix(brojN);
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo.");
				// Ako baci exception omogucava ponovni unos
				input.nextLine();
			}
		}
	}

	// Metodi prosledjujemo broj n i printamo matricu nxn
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
