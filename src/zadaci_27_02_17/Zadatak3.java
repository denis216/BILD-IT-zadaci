package zadaci_27_02_17;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {

	public static int largestRow(int[][] m) {
		//Nalazimo najveci 
		int maxIndex = 0;
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static int largestColumn(int[][] m) {
		int maxColumnIndex = 0;
		int max = 0;
		for (int j = 0; j < m[0].length; j++) {
			int count = 0;
			for (int i = 0; i < m.length; i++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxColumnIndex = j;
			}
		}
		return maxColumnIndex;
	}

	public static void unosMatriceRandomVrijednosti(int[][] matrix, int n, int m, int donjaGranica, int gornjaGranica) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = donjaGranica + (int) (Math.random() * ((gornjaGranica - donjaGranica) + 1));
			}
		}
	}

	public static void stampanjeMatrice(int[][] matrix, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];
		unosMatriceRandomVrijednosti(matrix, 4, 4, 0, 1);
		stampanjeMatrice(matrix, 4);
		System.out.println("The largest row index: " + largestRow(matrix));
		System.out.println("The larges column index: " + largestColumn(matrix));
		

	}

}