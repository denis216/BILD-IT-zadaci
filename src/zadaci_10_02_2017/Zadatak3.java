package zadaci_10_02_2017;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// Importovanje skenera
		Scanner input = new Scanner(System.in);
		// Pravimo 2 niza od 10
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		System.out.println("Unesite 10 brojeva u prvi niz ! ! !");
		// Unosimo brojeve u prvi niz
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		System.out.println("Unesite 10 brojeva u drugi niz ! ! !");
		// Unosimo brojeve u drugi niz
		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();
		}
		// Pozivamo metodu i printamo true ili false
		System.out.println(equals(array1, array2));
	}

	public static boolean equals(int[] niz1, int[] niz2) {
		// Prosledjujemo metodi equals niz1 i niz2 kako bi provjerili dali su
		// indenticni
		if (Arrays.equals(niz1, niz2)) {
			return true;
		} else {
			return false;
		}
	}
}
