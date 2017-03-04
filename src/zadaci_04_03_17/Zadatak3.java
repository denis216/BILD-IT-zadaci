package zadaci_04_03_17;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zadatak3 {

    //OD OVOOG ZADATKA MI KOMP ZABLOKIRA LOL
	public static void main(String[] args) {
		BigDecimal longmaxValue = new BigDecimal(Long.MAX_VALUE);

		long start = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal number = new BigDecimal(start);
		int count = 0;

		while (count < 5) {
			if (isPrime((number).longValue())) {
				count++;
				System.out.println("Number " + number + " is prime");
			}
			number = number.add(BigDecimal.ONE);
		}
	}

	public static boolean isPrime(long n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}