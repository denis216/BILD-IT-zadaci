package zadaci_04_03_17;
import java.math.BigInteger;

public class Zadatak5 {
	public static void main(String[] args) {

		BigInteger n = new BigInteger(Long.toString(Long.MAX_VALUE));
		displyDivisible(n);
	}

	// Method ispisuje prvih deset brojeva, vecih od Long.MAX_VALUE

	public static void displyDivisible(BigInteger n) {

		int counter = 0;
		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");

		while (counter < 10) {

			n = n.add(BigInteger.ONE);

			if (n.remainder(five).equals(BigInteger.ZERO) || n.remainder(six).equals(BigInteger.ZERO)) {

				System.out.println(n);
				counter++;
			}
		}
	}
}