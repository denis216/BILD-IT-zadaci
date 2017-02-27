package zadaci_27_02_17;
import java.util.Arrays;

public class Zadatak1 {

	public static void main(String[] args) {
		int[][] list = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		// Pozivamo metod
		sortiranje(list);
		System.out.println();
		for (int i = 0; i < list.length; i++) {
			int sum = ukupnoSati(list, i);
			System.out.println("Employee " + i + " have : " + sum + " hours");
		}
	}

	

	public static void sortiranje(int[][] list) {
		int[] row = new int[7];
		int counter = 0;
		for (int i = 0; i < list.length; i++) {
			System.out.print("Employee " + i + "  ");
			for (int j = 0; j < row.length; j++) {
				row[j] = list[i][j];
				counter++;
				if (counter == 7) {
					// Sortiramo u opadajucem
					Arrays.sort(row);
					for (int k = row.length - 1; k >= 0; k--)
						System.out.print(row[k] + " ");
					counter = 0;
				}
			}
			System.out.println();
		}
	}
	public static int ukupnoSati(int[][] time, int rowIndex) {
		
		int total = 0;
		int i = 0;
		for (int column = 0; column < time[i].length; column++) {
			total += time[rowIndex][column];
		}
	return total;
	}
	
}

