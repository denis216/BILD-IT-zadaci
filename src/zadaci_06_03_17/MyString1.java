package zadaci_06_03_17;

public class MyString1 {
	String str = "";

	// Pravimo prazan konstruktor jer on vraca ternutno vrednost
	MyString1() {

	}

	// Konstruktor koji vraca vrednost koju prosledimo
	MyString1(String b) {
		this.str = b;
	}

	// Metoda koja dodaje karaktere u string
	public MyString1(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			str += chars[i];
		}
	}

	// Metoda koja vraca karakter na odredjenom indexu
	public char charAt(int index) {
		return str.charAt(index);
	}

	// Metoda koja vraca duzinu stringa
	public int length() {
		return str.length();
	}

	// Metoda kojom odsecemo string od - do odredjenog indexa
	public MyString1 substring(int begin, int end) {
		return new MyString1(str.substring(begin, end));
	}

	// Metoda koja prebacuje u mala slova
	public MyString1 toLowerCase() {
		return new MyString1(str.toLowerCase());
	}

	// Metoda koja proveri da li su dva stringa jednaka
	public boolean equals(MyString1 s) {
		return str.equals(s.str);
	}

	// Metoda koja proveri vrednost stringa
	public static MyString1 valueOf(int i) {
		return new MyString1(String.valueOf(i));
	}

	// Metoda koja prebacuje u string
	public String toString() {
		return str;
	}
}
