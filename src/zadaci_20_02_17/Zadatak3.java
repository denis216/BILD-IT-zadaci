package zadaci_20_02_17;

public class Zadatak3 {

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 0; i <= 100000; i++) {
			// Ukoliko je i 0 ili 1 preskace
			if ((i == 0) || (i == 1)) {
				continue;

			}
			// Pozivamo metodu i printamo
			if (isPrime(i) == 1) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

	// Metoda za dobijanje prime broja.Vraca 0 ako broj nije prime a 1 ako je
	// prime
	public static int isPrime(int n) {

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}