package zadaci_06_03_17;

public class MyCharacterTest {

	public static void main(String[] args) {
		// Pravimo objekat koji ispitujemo, i pozivamo sve metode
		MyCharacter ch = new MyCharacter('B');

		System.out.println("Prebacimo karakter u malo slovo: " + ch.toLowerCase());
		System.out.println("Prebacimo karakter u veliko slovo: " + ch.toUpperCase());
		System.out.println("Da li je karakter koji smo prosledili malo slovo: " + ch.isLowerCase());
		System.out.println("Da li je karakter koji smo prosledili veliko slovo: " + ch.isUpperCase());
		System.out.println("Da li je karakter razmak: " + ch.isWhiteSpace());
		System.out.println("Da li je karakter broj: " + ch.isDigit());
		System.out.println("Da li je karakter slovo: " + ch.isLetter());
		System.out.println("Nas karakter je: " + ch);
	}

}