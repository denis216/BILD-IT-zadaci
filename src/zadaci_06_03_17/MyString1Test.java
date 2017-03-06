package zadaci_06_03_17;

public class MyString1Test {

	public static void main(String[] args) {
		// Napravimo dva niza i dva objekta
		char[] ch = { 'A', 'L', 'o', 'w' };
		char[] c = { 'B', 'u', 'T', 'e' };
		MyString1 string = new MyString1(ch);
		MyString1 s = new MyString1(c);

		// Pozovemo sve metode nase klase
		System.out.println("Prebacimo niz u mala slova: " + string.toLowerCase());
		System.out.println("Prosledjenih karaktera ima ukupno: " + MyString1.valueOf(1233).length());
		System.out.println("Slovo na prvom (1) indexu je: " + string.charAt(1));
		System.out.println("Duzina niza iznosi: " + ch.length);
		System.out.println("Odsecemo string od - do odredjenih indexa " + string.substring(2, string.length()));
		System.out.println("Da li su dva stringa ista: " + string.equals(s));
	}
}