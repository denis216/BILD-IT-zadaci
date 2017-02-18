package zadaci18_02_17;

public class Zadatak2 {

	public static void main(String[] args) {
		// Brojac za prelaz u novi red
		int brojac = 1;
		// Petlja vrti od 2 do 1000
		for (int i = 2; i <= 1000; i++) {
			int broj = 0;
			// Petlja vrti sve dok je j <=i
			for (int j = 1; j <= i; j++) {
				// Ako i % j nema ostatka inkrementiramo broj++
				if (i % j == 0) {
					broj++;
				}
			}
			// Ako je broj jednako 2 i brojac modulo od 8 == 0 printamo novi red
			// a ako nije printamo u istom redu
			if (broj == 2) {
				if (brojac % 8 == 0) {
					System.out.println(i);
				} else {

					System.out.print(i + " ");
				}
				brojac++;
			}
		}

	}

}
