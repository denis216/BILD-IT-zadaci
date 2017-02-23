package zadaci_23_02_17;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		//Ne znam dali treba ne trazi se u zadatku da se uklone prazna mjeste u string
		// a ako treba koristimo str.replaceAll("\\s","");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String str = input.nextLine();
		int duzinaStringa = str.length();
		char prvoSlovo = '0';
		System.out.println("Uneseni string sadrzi " + duzinaStringa + " slova");
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				prvoSlovo = str.charAt(i);
				break;
			}
		}
		System.out.println("Prvo slovo stringa je " + prvoSlovo);
	}

}

