package Hackathon;
import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int brojac = 0;
		System.out.println("Unesite prvi broj");
		int broj1 = input.nextInt();
		System.out.println("Unesite drugi broj");
		int broj2 = input.nextInt();
		for (int i = broj1; i <= broj2; i++) {
			int broj = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					broj++;

				}
			}
			if (broj == 2) {
			brojac++;
			}
		}
		System.out.println("U rasponu od " + broj1 + " do " + broj2 + " ima " + brojac + " prime broja");
	}
}
