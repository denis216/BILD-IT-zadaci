package zadaci_21_02_17;

public class Zadatak3 {

	public static void main(String[] args) {
		int brojac = 0;
		int broj = 2;

		while (brojac < 100) {
			if (isEmirp(broj)) {
				// Vrsimo provjru da li je broj Emirp.Ako jeste ispisujemo ga
				System.out.printf("%4d ", broj);
				brojac++;

				if (brojac % 10 == 0) {
					// Ako je brojac djeljiv sa 10, prelazimo u novi red
					System.out.println();
				}
			}

			broj++;
		}

	}

	// Metoda provjerava da li je broj Emirp
	public static boolean isEmirp(int number) {
		if (isPrime(number) && isPrime(reverse(number)) && !isPalindrome(number)) {
			return true;
		}

		return false;
	}

	// Metoda za provjeravanje da li je broj prost ili ne
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Metoda koja vraca broj naopako
	public static int reverse(int broj) {
		String reversNum = "";

		while (broj != 0) {
			reversNum += broj % 10;

			broj /= 10;
		}

		return Integer.parseInt(reversNum);
	}

	// Metoda koja  vrsi provjeru da li je broj palindrom
	public static boolean isPalindrome(int broj) {
		if (broj != reverse(broj)) {
			return false;
		}

		return true;
	}

}