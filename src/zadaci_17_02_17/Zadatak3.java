package zadaci_17_02_17;

public class Zadatak3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				// Ako i nije jednako j printa
				if (i != j) {
					System.out.println(i + " " + j);
				}
			}
		}

	}

}
