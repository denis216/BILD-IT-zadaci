package zadaci_04_03_17;
import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		long first = (long) Math.sqrt(Long.MAX_VALUE);
		String str = Long.toString(first);
		BigInteger n = new BigInteger(str);

		// Pozivamo metodu
		squareNumbers(n);

	}

	// Method koja izracunava i ispisuje kvadratne brojeve
	public static void squareNumbers(BigInteger n) {
		for (int i = 0; i < 10; i++) {
			n = n.add(BigInteger.ONE);
			System.out.println(n.pow(2));
		}
	}
}
