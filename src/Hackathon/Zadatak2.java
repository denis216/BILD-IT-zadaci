package Hackathon;

public class Zadatak2 {

	public static void main(String[] args) {
		int broj = 2;
		int brojac = 0;
		long suma = 0;
		while (brojac < 1000) {

			if (isPrimeNumber(broj)) {
				suma += broj;
				brojac++;
			}
			broj++;
		}
		System.out.println(suma);
	}

	private static boolean isPrimeNumber(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
