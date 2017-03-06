package zadaci_06_03_17;

public class MyStringBuilder1Test {
	public static void main(String[] args) {
		// Napravimo objekte koliko nam je potebno
		MyStringBuilder1 str = new MyStringBuilder1("aLow ");
		MyStringBuilder1 s = new MyStringBuilder1("ju");
		MyStringBuilder1 t = new MyStringBuilder1('8');

		// Pozovemo sve metode iz svoje klase
		System.out.println("Dodajemo broj na string: " + str.append(81));
		System.out.println("Dodajemo string na string: " + str.append(s));
		System.out.println("Duzina stringa iznosi: " + str.length());
		System.out.println("Karakter na nultom indexu je: " + str.charAt(0));
		System.out.println("Prebacujemo string u mala slova: " + str.toLowerCase());
		System.out.println("Isecemo stringu odredjene indexe: " + str.substring(1, str.length()));
		System.out.println("Prebacujemo u string: " + t.toString() + " " + str);

	}
}