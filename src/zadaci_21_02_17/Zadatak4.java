package zadaci_21_02_17;

public class Zadatak4 {

	public static void main(String[] args) {
		int brojac = 0;
		int broj = 2;

		while (brojac < 100) {
			if (isPalindromePrime(broj)) {
				// Provjeravam da li je broj palindrom i ispisujemo ga ako jeste
				System.out.printf("%5d ", broj);
				brojac++;

				if (brojac % 10 == 0) {
					// Ako je brojac djeljiv sa 10 prelazimo u novi red
					System.out.println();
				}
			}

			broj++;
		}

	}

	// Metoda koja vrsi provjeru da li je broj prost i palindrom
	public static boolean isPalindromePrime(int broj) {
		if (isPalindrome(broj) && isPrime(broj)) {
			return true;
		}

		return false;
	}

	// Metoda koja vrsi provjeru da li je broj prost
	public static boolean isPrime(int broj) {
		for (int i = 2; i <= broj / 2; i++) {
			if (broj % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Metoda koja vrsi provjeruda li je broj palindrom
	public static boolean isPalindrome(int broj) {
		if (broj != reverse(broj)) {
			return false;
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

}