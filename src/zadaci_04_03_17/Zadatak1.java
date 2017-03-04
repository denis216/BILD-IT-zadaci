package zadaci_04_03_17;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Zadatak1 {
	public static void main(String[] args) {
		// Pravimo obj
		BigInteger bi = BigInteger.TEN;
		bi = bi.pow(49);

		// Pozivamo metodu
		displayDivisible(bi);
	}

	// Method printa prvih 10 brojeva sa 50 decimalnih cifri djeljivih sa 2 ili 3
	public static void displayDivisible(BigInteger bigInt) {
		int counter = 0;
		while (counter < 10) {
			if (bigInt.remainder(new BigInteger("2")).equals(BigInteger.ZERO)
					|| bigInt.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {

				System.out.println(bigInt);
				counter++;
			}

			bigInt = bigInt.add(BigInteger.ONE);
		}
	}
}
