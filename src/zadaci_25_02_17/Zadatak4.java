package zadaci_25_02_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite 3x4 matricu red po red");
				double matrix[][] = new double[3][4];
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
						matrix[i][j] = input.nextDouble();
					}
				}
				
				//Printamo sumu za svaku kolonu pozivajuci sumColumn metodu
				for (int j = 0; j < 4; j++) {
					System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos! Pokusajte ponovo! ");
				input.nextLine();
			}
		}

	}
	//Metoda koja vraca sumu svih elemenata u specificnoj koloni
	public static double sumColumn(double[][] m, int columnIndex) {
		double suma = 0;
		for (int i = 0; i < m.length; i++) {
			suma += m[i][columnIndex];
		}

		return suma;
	}
}
