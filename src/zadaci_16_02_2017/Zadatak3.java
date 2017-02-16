package zadaci_16_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		int brojac = 1;
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				brojac++;
			} else if (brojac % 11 == 0) {
				System.out.println();
				brojac++;
			}
		}

	}

}
