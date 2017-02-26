package zadaci_25_02_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double matrix1[][] = new double[3][3];
		while (true) {
			try {
				System.out.println("Uneste brojeve u vasu 3x3 matricu 1:");
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
				System.out.println("Uneste brojeve u vasu 3x3 matricu 2:");
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
		double[][] addMatrix = addMatrix(matrix1, matrix2);

		// print the result of adding matrices
		for (int i = 0; i < addMatrix.length; i++) {

			// loop that prints first matrix
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			// condition that prints + sign
			if (i == 1) {
				System.out.print(" + ");
			} else {
				System.out.print("   ");
			}
			// loop that prints second matrix
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			// condition that prints = sign
			if (i == 1) {
				System.out.print(" = ");
			} else {
				System.out.print("   ");

			}
			// loop that prints result matrix
			for (int j = 0; j < addMatrix[i].length; j++) {
				System.out.print(addMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double result[][] = new double[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[j][i] += a[j][i] + b[j][i];
			}
		}
		return result;
	}

}
