package zadaci_10_02_2017;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Importovanje skenera
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brojeve u 3x3 2D niz ! ! !");
		double[][] niz = new double[3][3];
		// Unosimo brojeve u niz
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				niz[i][j] = input.nextDouble();
			}

		}
		// Sortiramo redove u postojecem 2d nizu
		niz = sortRows(niz);
		// Ispisujemo sortiranu matricu
		System.out.println("\nMatrica sa sortiranim redovima: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[0].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] sortRows(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			// Pozivamo metodu sort koja sortira svaki niz
			Arrays.sort(array[i]);
		}

		return array;
	}

}
