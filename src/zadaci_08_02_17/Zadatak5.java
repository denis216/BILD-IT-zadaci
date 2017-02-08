package zadaci_08_02_17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Importujemo scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite niz brojeva.Unos se zavrsava sa nulom (0).");

		// Importujemo ArrayList
		ArrayList<Integer> list = new ArrayList<>();

		int max = 0;
		int counter = 0;
		int num = input.nextInt();

		// Nastavljamo unositi u listu sve dok korisnik ne ispuni uslov odnosno
		// ne stisne 0
		while (num != 0) {
			list.add(num);
			num = input.nextInt();

		}
		// Pronalazimo najveci element u listi i importujemo Collection
		max = Collections.max(list);

		// For petljom brojimo koliko je puta unesen
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == max) {
				counter++;
			}
		}
		System.out.println("Najveci element koji ste unijeli je " + max + " unijeli ste ga " + counter + " puta.");

	}

}
