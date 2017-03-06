package zadaci_06_03_17;

public class MyCharacter {
	char ch = ' ';

	// Pravimo prazan konstruktor
	MyCharacter() {

	}

	// Konstruktor koji vraca odredjenu vrednost
	MyCharacter(char ch) {
		this.ch = ch;
	}

	// Metoda koja vraca odredjen karakter
	public char MyCharacter(char a) {
		return this.ch = a;
	}

	// Metoda koja prebacuje u velika slova
	public MyCharacter toUpperCase() {
		return new MyCharacter(Character.toUpperCase(ch));
	}

	// Metoda koja prebacuje u mala slova
	public MyCharacter toLowerCase() {
		return new MyCharacter(Character.toLowerCase(ch));
	}

	// Metoda koja proveri da li su velika slova
	public boolean isUpperCase() {
		return Character.isUpperCase(ch);
	}

	// Metoda koja proveri da li su mala slova
	public boolean isLowerCase() {
		return Character.isLowerCase(ch);
	}

	// Metoda koja prebacuje u string
	public String toString() {
		return Character.toString(ch);
	}

	// Metoda koja proveri da li je karakter broj
	public boolean isDigit() {
		return Character.isDigit(ch);
	}

	// Metoda koja proveri da li je karakter slovo
	public boolean isLetter() {
		return Character.isLetter(ch);
	}

	// Metoda koja proveri da li je karakter razmak
	public boolean isWhiteSpace() {
		return Character.isWhitespace(ch);
	}
}