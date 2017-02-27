package zadaci_27_02_17;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double matrix1[][] = new double[3][3];
		while (true) {
			try {
				System.out.println("Uneste brojeve u vasu 3x3 matricu 1.Nakon svakog unosa napravite razmak:");
				for (int i = 0; i < matrix1.length; i++) {
					for (int j = 0; j < matrix1[i].length; j++) {
						matrix1[i][j] = input.nextDouble();
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos.");
				input.nextLine();
			}
		}
		double matrix2[][] = new double[3][3];
		while (true) {
			try {
				System.out.println("Uneste brojeve u vasu 3x3 matricu 2.Nakon svakog unosa napravite razmak:");
				for (int i = 0; i < matrix2.length; i++) {
					for (int j = 0; j < matrix2[i].length; j++) {
						matrix2[i][j] = input.nextDouble();
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos:");
				input.nextLine();

			}
		}
		double[][] addMatrix = multiplyMatrix(matrix1, matrix2);

		// Printa rezultat
		for (int i = 0; i < addMatrix.length; i++) {

			// Printa prvu matricu
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			// Printa * znak
			if (i == 1) {
				System.out.print(" * ");
			} else {
				System.out.print("   ");
			}
			// Printa drugu matricu
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			// Printa = znak
			if (i == 1) {
				System.out.print(" = ");
			} else {
				System.out.print("   ");

			}
			// Printa rezultat matrice
			for (int j = 0; j < addMatrix[i].length; j++) {
				String formattedString = String.format("%.01f",addMatrix[i][j]);
				System.out.printf(formattedString + " ");
			}
			System.out.println();

		}

	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] matrixResults = new double[3][3];
		double sum = 0;
		// Mnozimo matrice
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int n = 0; n < 3; n++) {
					sum += a[i][n] * b[n][j];
				}
				matrixResults[i][j] = sum;
				sum = 0;
			}
		}
		return matrixResults;
	}

}
