package zadaci_08_03_2017;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite velicinu niza n: ");
				int n = input.nextInt();
				int[][] m = new int[n][n];

				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++) {
						m[i][j] = (int) (Math.random() * 2);
						System.out.print(m[i][j] + " ");
					}
					System.out.println();
				}

				ArrayList<Integer> row = new ArrayList<>();
				ArrayList<Integer> column = new ArrayList<>();
				getHighestRow(m, row);
				getHighestColumn(m, column);

				System.out.println("Najveci index reda: " + row);
				System.out.println("Najveci index kolone: " + column);
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo:");
				input.nextLine();

			}
		}
	}

	public static void getHighestRow(int[][] m, ArrayList<Integer> row) {

		int highest = 0;
		for (int i = 0; i < m.length; i++) {
			int occurrence = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					occurrence++;
				}
			}

			if (highest < occurrence) {
				highest = occurrence;
				row.clear();
				row.add(i);
			} else if (highest == occurrence) {
				row.add(i);
			}
		}

	}

	public static void getHighestColumn(int[][] m, ArrayList<Integer> column) {

		int highest = 0;
		for (int j = 0; j < m[0].length; j++) {
			int occurrence = 0;
			for (int i = 0; i < m.length; i++) {

				if (m[i][j] == 1) {
					occurrence++;
				}
			}
			if (highest < occurrence) {
				highest = occurrence;
				column.clear();
				column.add(j);
			} else if (highest == occurrence) {
				column.add(j);
			}
		}
	}
}