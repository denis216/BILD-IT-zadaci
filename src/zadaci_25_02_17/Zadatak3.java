package zadaci_25_02_17;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite velicinu niza: ");
				int[] niz = new int[input.nextInt()];
				System.out.println("Unesite brojeve: ");
				for (int i = 0; i < niz.length; i++) {
					niz[i] = input.nextInt();

				}
				//Ako sadrzi 4 uzastopna ista printa poruku
				if (isConsecutiveFour(niz)) {
					System.out.println("The list has consecutive fours");
					//Ako ne sadrzi printa poruku
				} else {
					System.out.println("The list has no consecutive fours");
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo!");
				input.nextLine();
			}
		}
	}
	//Metoda za provjeru da li sadrzi 4 uzastopna ista broja
	public static boolean isConsecutiveFour(int[] values) {
		//Ako je vrednost tj velicina niza 4 ili vise vrsit ce provjeru a ako nije vraca false
		if (values.length >= 4) {
			for (int i = 0; i < values.length - 3; i++) {
				if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
					return true;
				}
			}
		}
		return false;
	}

}
