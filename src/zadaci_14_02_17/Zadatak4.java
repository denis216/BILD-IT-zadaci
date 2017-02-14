package zadaci_14_02_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string");
		String str = input.nextLine();
		for (int i = 0; i < str.length(); i++) {
			// Ispisujemo karaktere na nepranim pozicijiama
			if (i % 2 == 0) {
				System.out.print(str.charAt(i));
			}
		}

	}

}
