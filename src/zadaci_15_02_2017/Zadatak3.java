package zadaci_15_02_2017;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mjesec = "";
		int godina = 0;
		while (true) {
			try {
				System.out.println("Unesite godinu:");
				godina = input.nextInt();
				validnaGodina(godina);
				break;
			} catch (Exception e) {
				System.out.println("Ponovite unos.");
				input.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("Unesite mjesec:");
				mjesec = input.next();
				validanMjesec(mjesec);
				break;
			} catch (Exception e) {
				System.out.println("Ponovite unos.");
				input.nextLine();
			}
		}
		printDaniUMjesecu(godina, mjesec);

	}

	// Ispis u zavisti od unosa
	public static void printDaniUMjesecu(int godina, String mjesec) {

		if (mjesec.equals("Jan")) {
			System.out.println(mjesec + " " + godina + " ima 31 dan.");
		} else if (mjesec.equals("Feb")) {

			if (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0)) {
				System.out.println("Februar " + godina + " ima 29 dana.");
			} else {
				System.out.println("Februar " + godina + " ima 28 dana.");
			}
		} else if (mjesec.equals("Mar")) {
			System.out.println(mjesec + " " + godina + " ima 31 dan.");
		} else if (mjesec.equals("Apr")) {
			System.out.println(mjesec + " " + godina + " ima 30 dan.");
		} else if (mjesec.equals("Maj")) {
			System.out.println(mjesec + " " + godina + " ima 31 dan.");
		} else if (mjesec.equals("Jun")) {
			System.out.println(mjesec + " " + godina + " ima 30 dan.");
		} else if (mjesec.equals("Jul")) {
			System.out.println(mjesec + " " + godina + " ima 31 dan.");
		} else if (mjesec.equals("Avg")) {
			System.out.println(mjesec + " " + godina + " ima 31 dan.");
		} else if (mjesec.equals("Sep")) {
			System.out.println(mjesec + " " + godina + " ima 30 dan.");
		} else if (mjesec.equals("Okt")) {
			System.out.println(mjesec + " " + godina + " ima 31 dan.");
		} else if (mjesec.equals("Nov")) {
			System.out.println(mjesec + " " + godina + " ima 30 dan.");
		} else if (mjesec.equals("Dec")) {
			System.out.println(mjesec + " " + godina + " ima 31 dan.");
		}

	}

	// Metoda provjerava dali su mjeseci unesen u pravilnom formatu
	public static boolean validanMjesec(String mjesec) throws Exception {
		if (!mjesec.equals("Jan") && !mjesec.equals("Feb") && !mjesec.equals("Mar") && !mjesec.equals("Apr")
				&& !mjesec.equals("Jun") && !mjesec.equals("Jul") && !mjesec.equals("Avg") && !mjesec.equals("Sep")
				&& !mjesec.equals("Okt") && !mjesec.equals("Nov") && !mjesec.equals("Dec") && !mjesec.equals("Maj")) {
			throw new Exception("GRESKA");

		}
		return true;
	}

	// Ne dozvoljava negativan unos za godinu i ispod 1900 godine
	public static boolean validnaGodina(int godina) throws Exception {
		if (godina < 1900) {
			throw new Exception("Nemoguc unos");
		}
		return true;
	}

}