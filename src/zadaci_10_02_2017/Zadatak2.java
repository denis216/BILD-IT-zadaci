package zadaci_10_02_2017;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Importovanje skenera
		Scanner input = new Scanner(System.in);
		// Pravimo niz od 10
		double[] array = new double[10];
		System.out.println("Unesite 10 brojeva u vas niz ! ! !");
		// Unosimo brojeve u niz
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		// Printamo poruku i pozivamo metodu min
		System.out.println("Najmanji element u nizu je " + min(array));

	}

	// Metoda za dobijanje najmanjeg elementa u nizu
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			// Vrsimo provjeru ako je broj na indexu i manji od min dodjeljujemo
			// taj broj varijabli min
			if (array[i] < min) {
				min = array[i];
			}
		}
		// Vracamo rezultat min
		return min;
	}
}
