package zadaci_17_02_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String str = input.nextLine();
		System.out.println("Unesite samo jedan  karakter koji zelite da prebrojite u datom stringu\nUkoliko stavite vise od jednog karaktera program ce uzeti u obzir samo prvi karakter: ");
		char c = input.next().charAt(0);
		int brPonavljanja = count(str, c);
		if (brPonavljanja == 0) {
			System.out.println("Karakter " + c + " ne postoji u stringu");
		} else if (brPonavljanja > 0) {
			System.out.println("Karakter se ponovio " + count(str, c) + " puta");
		}

	}
	//Metoda koja vraca broj ponavljanja
	public static int count(String str, char a) {
		int brojac = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				brojac++;
			}
		}
		return brojac;
	}

}
/*
 * VAZNO mogli smo staviti i ovako i u ovom slucaju ne bi dozvolio da stavimo vise od 1 karaktera
 * Scanner input = new Scanner(System.in);
 * 
 * 
 * try {
 *  System.out.println("Unesite string: "); 
 *  String str = input.nextLine();
 * System.out.println("Unesite karakter koji želite da prebrojite: "); 
 * String ch= input.nextLine();
 *  if (ch.length() > 1) { 
 *  System.out.println("Pogrešan unos.Unesite samo jedan karakter."); 
 *  } 
 *  else { char a =ch.charAt(0); System.out.println("Karakter se u stringu ponavlja " +count(str, a) + " puta.");
 *   }
 * 
 * input.close();
 * 
 * } catch (Exception ex) {
 *
 * System.out.println("Došlo je do greške."); }
 * 
 * }
 * 
 * public static int count(String str, char a) {
 * 
 * int countChar = 0; for (int i = 0; i < str.length(); i++) {
 * 
 * if (a == str.charAt(i)) { countChar++;
 * 
 * } } return countChar;
 * 
 * }
 * 
 * }
 */