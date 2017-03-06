package zadaci_06_03_17;

public class MyString2 {

	String str = "";

	// Napravimo prazan konstruktor
	MyString2() {

	}

	// Konstruktor koji vraca vrednost koju prosledimo
	public MyString2(String s) {
		this.str = s;
	}

	// Metoda koja uporedjuje dva stringa
	public int compare(String s) {
		return s.compareTo(str);
	}

	// Metoda koja odsece string
	public MyString2 substring(int begin) {
		return new MyString2(str.substring(begin));
	}

	// Metoda koja prebacuje string u velika slova
	public MyString2 toUpperCase() {
		return new MyString2(str.toUpperCase());
	}

	// Metoda koja string prebacuje u niz karaktera
	public char[] toChars() {
		return str.toCharArray();
	}

	public static MyString2 valueOf(boolean b) {
		return new MyString2(String.valueOf(b));
	}

	public String toString() {
		return str;
	}

	public int length() {
		return str.length();
	}

}