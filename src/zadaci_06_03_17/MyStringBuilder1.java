package zadaci_06_03_17;

public class MyStringBuilder1 {
	String s = "";

	// Pravimo prazan konstruktor
	MyStringBuilder1() {

	}

	// Konstruktor koji vraca vrednost koju primi
	public MyStringBuilder1(String s) {
		this.s = s;
	}

	public MyStringBuilder1(char s) {
		this.s += s;
	}

	// Metoda koja dodaje string na postojeci strng
	public MyStringBuilder1 append(MyStringBuilder1 m) {
		return new MyStringBuilder1(s + ("" + m));
	}

	// Metoda koja dodaje broj na odredjen string
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(s + (i + ""));
	}

	// Metoda koja vraca duzinu stringa
	public int length() {
		return s.length();
	}

	// Metoda koja vraca karakter na odredjenom indexu
	public char charAt(int index) {
		return s.charAt(index);
	}

	// Metoda koja prebacuje string u mala slova
	public MyStringBuilder1 toLowerCase() {
		return new MyStringBuilder1(s.toLowerCase());
	}

	// Metoda koja odseca string od - do odredjenog indexa
	public MyStringBuilder1 substring(int begin, int end) {
		return new MyStringBuilder1(s.substring(begin, end));
	}

	// Prebacuje u string
	public String toString() {
		return s.toString();
	}
}