package zadaci_27_02_17;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zadatak4 {

	public static void sort(int[][] m) {
		for (int i = 0; i < m.length - 1; i++) {
			// trazi minimum u m
			int najmanjiRed = m[i][0];
			int najmanjiKolona = m[i][1];
			int najmanjiIndex = i;

			for (int j = i + 1; j < m.length; j++) {
				// provjeravanje najmanje vrijednosti u redu
				if (najmanjiRed > m[j][0]) {
					najmanjiRed = m[j][0];
					najmanjiKolona = m[j][1];
					najmanjiIndex = j;
				} else if (najmanjiRed == m[j][0] && najmanjiKolona > m[j][1]) {
					najmanjiKolona = m[j][1];
					najmanjiIndex = j;
				}
			}
			if (najmanjiIndex != i) {
				m[najmanjiIndex][0] = m[i][0];
				m[i][0] = najmanjiRed;
				m[najmanjiIndex][1] = m[i][1];
				m[i][1] = najmanjiKolona;

			}
		}

		stampanjeMatrice(m, 6, 2);
	}

	public static void stampanjeMatrice(int[][] matrix, int n, int m) {
		//Stampamo matricu
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		//Pravimo matricu i sortiramo 
		int[][] matrix = { { 4, 2 }, 
				     	   { 1, 7 }, 
				     	   { 4, 5 }, 
				     	   { 1, 2 }, 
				     	   { 1, 1 }, 
				     	   { 4, 1 } };
		sort(matrix);

	}
}