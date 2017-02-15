package MiniProjekatCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class MyMonth {

	public static void main(String[] args) {

		// Pretstavlja mjesec od (1-12)
		int mjesec;

		// Predstavlja godinu
		int godina;

		// Pita korisnika da unese mjesec i godinu
		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.print("Unesi mjesec: ");

		// Ucitava kao string
		String mjesecText = input.next();

		System.out.println("Unesi godinu:");
		String godinaText = input.next();
			try {

				// Pretvoriti mjesec i godinu u int
				// Baca exception i hvata ga po potrebi
				mjesec = Integer.parseInt(mjesecText);
				godina = Integer.parseInt(godinaText);

				// Provjerava da li je vazeci mjesec
				if (mjesec < 1 || mjesec > 12)
					throw new Exception("Nepravila unos za mjesec: " + mjesec);

				// Ispis kalendara za dati mjesec / godinu
				printCalendarMonthYear(mjesec, godina);
				break;
			} catch (NumberFormatException e) {
				System.err.println("Nepravilan format broja: " + e.getMessage());
				input.nextLine();

			} catch (Exception e) {
				System.err.println(e.getMessage());
				input.nextLine();

			}
		}
	}

	/*
	 * Printa kalendar zasnovan na mjesecu i godini
	 */
	private static void printCalendarMonthYear(int mjesec, int godina) {
		// Kreiramo novi GregorianCalendar objekat
		Calendar cal = new GregorianCalendar();

		// Postaviti datum na prvi dan u mjesecu / godini
		cal.clear();
		cal.set(godina, mjesec - 1, 1);

		// Printa zaglavlje kalendara
		System.out.println("\n" + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " "
				+ cal.get(Calendar.YEAR));

		// Dobiti prvi dan u mjesecu
		int prvaSedmicaUMjesecu = cal.get(Calendar.DAY_OF_WEEK);

		// Dobiti broj dana u mjesecu
		int brojDanaUMjesecu = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// print anonymous calendar month based on the weekday of the first
		// day of the month and the number of days in month:
		printCalendar(brojDanaUMjesecu, prvaSedmicaUMjesecu);

	}

	/*
	 * Printa kalendar na osnovu broja dana u mjesecu i prvog dana u sedmici mjeseca
	 */
	private static void printCalendar(int brojDanaUMjes, int prviDanUSedmiciMjeseca) {

		// Resetuje index sedmice
		int indexSedmice = 0;

		// Printa dane
		System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");

		// Preskace dane
		for (int day = 1; day < prviDanUSedmiciMjeseca; day++) {
			System.out.print("    ");
			indexSedmice++;
		}

		// Ispisuje danae mjeseca u tabelarnom formatu
		for (int day = 1; day <= brojDanaUMjes; day++) {
			// Printa dan
			System.out.printf("%1$2d", day);

			// Sledeca sedmica
			indexSedmice++;
			// Ako je zadnji radni dan
			if (indexSedmice == 7) {
				// Resetuje ga
				indexSedmice = 0;
				// Ide na sledecu liniju
				System.out.println();
			} else { 
				System.out.print("  ");
			}
		}

		// Printa finalnu liniju praznu
		System.out.println();

	}

}