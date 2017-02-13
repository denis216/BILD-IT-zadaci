package zadaci_13_03_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Importujemo skener
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite nekakav string:");
		String str = input.nextLine();
		// Printa poruku i poziva metodu countLetters.
		System.out.println("Uneseni string ima " + countLetters(str) + " slova");

	}

	// Metoda koja vraca broj slova u stringu a ne broji ako korisnik unese
	// brojeve
	// Posto se u zadatku trazi da broji samo slova.
	public static int countLetters(String s) {
		// Brojac slova
		int brojac = 0;
		for (int i = 0; i < s.length(); i++) { // Petlja vrti od pocetka string
												// do kraja
			if (Character.isLetter(s.charAt(i))) { // Provjerava ako je karakter
													// slovo na indexu i dodaje
													// brojacu 1
				brojac++;
			}
		}
		return brojac;
	}

}
