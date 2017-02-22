package zadaci_22_02_17;

import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Petlja vrti dok nije ispunjen uslov
		while (true) {
			try {
				System.out.println("Unesite neki broj nako toga pritisnite (enter)");
				long broj = input.nextLong();
				System.out.println("Suma broja " + broj + " je: " + sumDigits(broj));
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos pokusajte ponovo!");
				// Ako baci exception omogucava ponovni unos
				input.nextLine();
			}
		}
	}

	// Metoda kojoj prosledjujemo broj i radimo sabiranje svih brojeva od
	// prosledjenih
	public static int sumDigits(long n) {
		int temp = (int) Math.abs(n);
		int sum = 0;
		// Petlja vrti dok tem ne dodje do 0
		while (temp != 0) {
			int remainder = temp % 10;
			sum += remainder;
			temp = temp / 10;
		}

		return sum;
	}
}