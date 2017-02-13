package zadaci_13_03_17;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		String str1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String str2 = input.nextLine();

		// Prazan string
		String istiPrefix = "";

		int min = Math.min(str1.length(), str2.length());
		for (int i = 0; i < min; i++) {
			// Kad naidje na prvo razlicito slovo petlja prekida sa radom
			if (str1.charAt(i) != str2.charAt(i)) {
				break;
				//Ako si ista dodaje u istiPrefix
			} else {
				istiPrefix += str1.charAt(i);
			}

		}
		//ako je duzina string istiPrefix 0 nemaju zajednicki
		if (istiPrefix.length() == 0) {
			System.out.println("Uneseni stringovi nemaju zajednicki prefix");

			// Ispisujemo zajednicki prefix
		} else {
			System.out.println("Najveci zajednicki prefix je: " + istiPrefix);
		}
	}
}
