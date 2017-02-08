package zadaci_08_02_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] counter = new int[10];
		int[] array = new int[100];

		// Generisemo 100 random brojeva u arraylisti
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		// Prebrojavanje ponavljanja u array-u
		for (int i = 0; i < array.length; i++) {
			counter[array[i]]++;
		}

		// Printanje liste koja sadrzava broj ponvaljanja od 0 do 9
		for (int i = 0; i < counter.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + counter[i] + " puta");
		}
	}

}
