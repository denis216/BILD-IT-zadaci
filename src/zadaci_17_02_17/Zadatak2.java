package zadaci_17_02_17;

public class Zadatak2 {

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 2; i < 9998; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.print(i + " " + (i + 2) + "   ");
				brojac++;
			}
			if (brojac == 10) {
				brojac = 0;
				System.out.println();
			}
		}

	}
	//Metoda za dobijanje twin prime brojeva
	public static boolean isPrime(int n) {
		if (n == 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;



	}
}
