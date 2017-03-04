package zadaci_03_03_17;

public class Zadatak5DisplayingThePrimeNumbers {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		// Find and push all prime numbers less than 120 to stack
		for (int i = 2; i < 120; i++) {
			if (isPrime(i))
				stack.push(i);
		}

		// Displays all the prime numbers less than 120 in decreasing order
		System.out.println("All the prime numbers less than 120 in decreasing order:");
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	// Method that returns true if n is a prime number
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
