package zadaci_22_02_17;

public class Zadatak3 {

	public static void main(String[] args) {
		double suma = 0;
		for (double i = 1; i <= 97; i += 2) {
			suma += i / (i + 2);
		}
		System.out.println(suma);
	}
}
