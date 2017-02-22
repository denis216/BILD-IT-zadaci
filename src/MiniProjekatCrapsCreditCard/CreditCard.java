package MiniProjekatCrapsCreditCard;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCard {

	public static final int PREFIX_VISA = 4;
	public static final int PREFIX_MASTER = 5;
	public static final int PREFIX_AMERICAN_EXPRESS = 37;
	public static final int PREFIX_DISCOVER = 6;

	public static void main(String[] args) {

		long number = takeInput(" Molimo unesite broj kreditne kartice :  :");
		if (isValid(number)) {
			System.out.println("Vas broj je u redu.");
		} else {
			System.out.println("Vas broj nije u redu.");
		}

	}

	// Uzimamo input od korisnika
	public static long takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		long userInput = 0;
		while (!isGood) {
			try {
				isGood = true;
				userInput = input.nextLong();
			} catch (InputMismatchException ex) {
				System.out.println("Pokusajte ponovo. (" + "Pogresan unos.Unesite broj u trazenom formatu: )");
				isGood = false;
			} finally {
				input.nextLine();
			}
		}

		return userInput;
	}

	// Vracca true ako je broj validan
	public static boolean isValid(long number) {
		if ((getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, PREFIX_VISA) || prefixMatched(number, PREFIX_MASTER)
						|| prefixMatched(number, PREFIX_AMERICAN_EXPRESS) || prefixMatched(number, PREFIX_DISCOVER))) {
			if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
				return true;
			}
		}
		return false;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = Long.toString(number);
		for (int i = num.length() - 2; i >= 0; i -= 2) {
			sum += getDigit(2 * Character.getNumericValue(num.charAt(i)));
		}
		return sum;
	}

	// Vraca broj ako je jednocifren, u suprotnom vraca sumu dva broja
	public static int getDigit(int number) {
		if (number > 9) {
			return (number % 10 + number / 10);
		}

		return number;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = Long.toString(number);
		for (int i = num.length() - 1; i >= 0; i -= 2) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		return sum;

	}

	// Vraca true ako broj d prefix unesenog broja
	public static boolean prefixMatched(long number, int d) {
		long prefix = getPrefix(number, getSize(d));
		return prefix == d;

	}

	// Vraca broj cifri broja
	public static int getSize(long d) {
		String number = Long.toString(d);
		return number.length();

	}

	// Prebacimo broj u string,ako je duzina manja od k vracamo broj
	public static long getPrefix(long number, int k) {
		String num = Long.toString(number);
		if (num.length() < k) {
			return number;
		}
		return Long.valueOf(num.substring(0, k));
	}
}