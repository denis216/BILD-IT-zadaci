package zadaci18_02_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Unesite broj minuta: ");
				long minutes = input.nextLong();
				if (minutes < 0) {
					System.out.println("Broj minuta mora biti veci od 0.Pokusajte ponovo");
					minutes = input.nextLong();
				}
				displayYearsAndMonths(minutes);
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos! Pokusajte ponovo");
				input.nextLine();
			}

		}
	}

	/**
	 * Method prihvata broj minuta kao long broj, izracunava broj godina i
	 * mjeseci i ispisuje
	 */
	public static void displayYearsAndMonths(long n) {

		long minutes = n;

		final long MINUTES_IN_YEAR = 60 * 24 * 365;

		long totalYears = minutes / MINUTES_IN_YEAR;
		minutes %= MINUTES_IN_YEAR;
		long totalMonths = minutes / (MINUTES_IN_YEAR / 12);

		System.out.println("U " + n + " minuta ima " + totalYears + " godina i " + totalMonths + " mjeseci");
	}

}