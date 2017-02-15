package zadaci_15_02_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		// Vanska petlja vrti jednom dok unutrasnja vrti sve dok je j<i
		for (int i = 1; i < 10000; i++) {
			int suma = 0;
			// Unutrasnja petlja
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					suma += j;
				}
			}
			// Ako je i == sumi broj je savrsen i printamo ga
			if (i == suma)
				System.out.println(i);
		}
	}
}
