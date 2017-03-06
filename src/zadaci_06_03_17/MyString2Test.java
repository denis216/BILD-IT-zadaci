package zadaci_06_03_17;

public class MyString2Test {

	public static void main(String[] args) {
		// Pravimo objekat
		MyString2 str = new MyString2("Aloww");

		// Pozivamo sve metode koje smo prethodno napravili u svojoj klasi
		System.out.println("Uporedimo dva stringa: " + str.compare("Wolla"));
		System.out.println("Odsecemo string: " + str.substring(3));
		System.out.println("Prebacimo u velika slova: " + str.toUpperCase());
		System.out.println("Vrednost stringa: " + MyString2.valueOf(true));

		char ch[] = str.toChars();
		System.out.print("Prebacimo string u karaktere: ");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(ch[i] + " ");
		}
	}
}