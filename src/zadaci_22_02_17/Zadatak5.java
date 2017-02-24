package zadaci_22_02_17;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Petlja vrti dok nije ispunjen uslov
		int brojN = 0;
		while (true) {
			try {
				System.out.println("Unesite broj n");
				brojN = input.nextInt();
				while (brojN <= 0 || brojN > 100) {
					System.out.println("Broj mora biti izmedju 1 i 100. Unesi ponovo: ");
					brojN = input.nextInt();
				}
				break;
				
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo.");
				// Ako baci exception omogucava ponovni unos
				input.nextLine();
			}
		}
		// Pozivamo metodu i prosledjujemo joj unos
		printMatrix(brojN);
		
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
