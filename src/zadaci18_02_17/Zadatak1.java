package zadaci18_02_17;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo niz za 3 unosa
		String[] arr = new String[3];
		// Prompt the user to enter two cities
		System.out.print("Unesite prvi grad: ");
		arr[0] = input.nextLine();
		System.out.print("Unesite drugi grad: ");
		arr[1] = input.nextLine();
		System.out.print("Unesite treci grad: ");
		arr[2] = input.nextLine();
		// Pozivamo Arrays.sort da sortiramo unesene gradove
		Arrays.sort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
}