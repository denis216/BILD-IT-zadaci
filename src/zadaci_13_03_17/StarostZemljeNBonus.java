package zadaci_13_03_17;
import java.util.Scanner;

public class StarostZemljeNBonus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko godina zelite da se vratite u buducnost ? ? ? ");

		long year = 0;

		// Petlja se izvrsava dok korisnik ne unesevrijednost
		while (true) {

			try {
				year = input.nextLong();
				break;
			} catch (Exception ex) {
				System.out.println("Molimo unesite neki broj: ");
				input.nextLine();
			}
		}

		long seconds = year;
		long curentSeconds = seconds % 60;
		long minutes = seconds / 60;
		long curentMinutes = minutes % 60;
		long hours = minutes / 60;
		long curentHours = hours % 24;
		System.out.println();
		System.out.println("Da bi se vratio " + year + " godina u proslost potrebno je " + "\nSat " + curentHours
				+ "\nMinute " + curentMinutes + "\nSekunde " + curentSeconds);

		long day = hours / 24;
		long curentDays = hours % 24;
		long mounts = day % 12;
		long years = day / 365;
		System.out.println();
		System.out.println("\nTakodje da se vratio " + year + " godina u proslost potrebno je " + "\nDana " + curentDays
				+ "\nMjeseci " + mounts + "\nGodina " + years);

		long decenija = years / 10;
		long stoljeca = years / 100;
		long milenijuma = years / 1000;
		System.out.println();
		System.out.println("\nA da bi se vratio u " + year + " godina u proslost potrebno je " + "\nDecenija "
				+ decenija + "\nStoljeca " + stoljeca + "\nMilenijuma " + milenijuma);

	}
}