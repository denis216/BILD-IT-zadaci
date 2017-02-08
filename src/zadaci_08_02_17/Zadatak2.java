package zadaci_08_02_17;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Importovanje Scanner-a
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string");
		String str = input.nextLine();
		int brojacSamoglasnika = 0;
		int brojacSuglasnika = 0;

		// Pretvaramo string u velika slova i prolazimo kroz string te
		// dodjeljujemo varijabli brojacaSamoglasnika ako uneseni string na
		// charAt(i) sadrzi samoglasnik a ako ne sadrzi dodajmo varijabli
		// brojacSuglasnika
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U') {
				brojacSamoglasnika++;
			} else {
				brojacSuglasnika++;
			}
		}
		System.out.println("Sadrzi " + brojacSamoglasnika + " samoglasnika i " + brojacSuglasnika + " suglasnika");

	}

}
