package zadaci_15_02_2017;
import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[] args) {
		System.out.println("Unesite vas password: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if (pass(str)) {
			System.out.println("Password je validan");
		} else
			System.out.println("Password nije validan");

	}

	// Metoda provjerava da li je duzina stringa manja od 8
	// nakon toga prolazi kroz string i broji koliko ima slova i brojeva.
	// Ako je zbri slova i brojeva jednak duzini stringa i brojac brojeva veci
	// ili jednak od 2 vraca true.U suprotnom pasword nije validan
	public static boolean pass(String str) {
		if (str.length() < 8)
			return false;
		int broj = 0;
		int slova = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				broj++;
			}
			if (Character.isLetter(str.charAt(i))) {
				slova++;
			}
		}
		if (broj + slova == str.length() && broj >= 2) {
			return true;
		} else
			return false;
	}

}
