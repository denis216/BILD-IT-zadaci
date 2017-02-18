package zadaci_17_02_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		String prviString = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String drugiString = input.nextLine();

		// Metoda contains provjerava da li je drugi string substring prvog
		if (prviString.contains(drugiString))
			System.out.println("\n" + drugiString + " je substring stringa " + prviString);
		else
			System.out.println("\n" + drugiString + " nije substring stringa " + prviString);

		input.close();
	}

}