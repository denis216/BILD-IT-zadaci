package zadaci_09_02_17;

public class Zadatak1 {

	public static void main(String[] args) {
		// pravimo brojac da bismo mogli preci u novi red posle 10 ispisa
		int counter = 0;
		for (int i = 101; i <= 2100; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				// ako je godina prestupna ispisujemo je
				System.out.print(i + " ");
				counter++;
				// ako je brojac %10==0 prelazimo u novi red
				if (counter % 10 == 0) {
					System.out.println();
				}
			}

		}
		// ispisujemo ukupan broj prestupnih godina
		System.out.println("\nUkupan broj prestupnih godina je " + counter);
	}

}
