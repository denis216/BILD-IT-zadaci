package zadaci_23_02_17;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite cijeli trocifren broj");
				int broj = input.nextInt();
				while (broj < 100 || broj > 999) {
					System.out.println("Pogresan unos.Unesite trocifren broj:");
					broj = input.nextInt();
				}
				if (broj % 10 == broj / 100) {
					System.out.println("Broj je palindrom");
				} else {
					System.out.println("Broj nije palindrom");
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos pokusajte ponovo!");
				input.nextLine();
			}
		}
	}
}
