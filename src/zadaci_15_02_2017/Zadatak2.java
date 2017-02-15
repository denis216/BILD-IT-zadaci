package zadaci_15_02_2017;
import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mjesec = 0;
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
				mjesec = input.nextInt();
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
	public static void printDaniUMjesecu(int godina, int mjesec) {
		switch (mjesec) {
		case 1:
			System.out.println("Januar " + godina + " ima 31 dan.");
			break;

		case 2: {
			if (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0)) {
				System.out.println("Februar " + godina + " ima 29 dana.");
			} else {
				System.out.println("Februar " + godina + " ima 28 dana.");
			}
		}
			break;
		case 3:
			System.out.println("Mart " + godina + " ima 31 dan.");
			break;
		case 4:
			System.out.println("April " + godina + " ima 30 dan.");
			break;
		case 5:
			System.out.println("Maj " + godina + " ima 31 dan.");
			break;
		case 6:
			System.out.println("Jun " + godina + " ima 30 dan.");
			break;
		case 7:
			System.out.println("Juli " + godina + " ima 31 dan.");
			break;
		case 8:
			System.out.println("Avgust " + godina + " ima 31 dan.");
			break;
		case 9:
			System.out.println("Septembar " + godina + " ima 30 dan.");
			break;
		case 10:
			System.out.println("Oktobar " + godina + " ima 31 dan.");
			break;
		case 11:
			System.out.println("Novembar " + godina + " ima 30 dan.");
			break;
		case 12:
			System.out.println("Decembar " + godina + " ima 31 dan.");
			break;
		}
	}

	// Metoda provjerava dali su mjeseci u raspono od 1 do 12
	public static boolean validanMjesec(int mjesec) throws Exception {
		if (mjesec < 1 || mjesec > 12) {
			throw new Exception("Error");
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