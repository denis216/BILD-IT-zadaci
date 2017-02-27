package zadaci_27_02_17;

public class Zadatak5 {

	public static void main(String[] args) {
		
		// Pravimo niz novi
		int[][] matrix = new int[6][6];

		int[] rowCount = new int[matrix.length];
		int[] colCount = new int[matrix[0].length];

		// Kreiramo niz i punimo ga sa 0 i 1
		// Brojimo 1
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
				if (matrix[i][j] == 1) {
					rowCount[i]++;
					colCount[j]++;
				}

			}
			System.out.println();

		}
		// Printamo rezultat redova
		for (int i = 0; i < rowCount.length; i++) {
			if (rowCount[i] % 2 == 0) {
				System.out.println("Row " + i + " has even number of 1s");
			} else {
				System.out.println("Row " + i + " does not have even number of 1s");
			}
		}
		// Printamo rezultat kolona
		for (int i = 0; i < colCount.length; i++) {
			if (colCount[i] % 2 == 0) {
				System.out.println("Column " + i + " has even number of 1s");
			} else {
				System.out.println("Column " + i + " does not have even number of 1s");
			}
		}

	}
}