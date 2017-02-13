package zadaci_13_03_17;
import java.util.Scanner;

public class CalculatorBonus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				double n1, n2;
				String operation;

				System.out.println("Enter first number");
				n1 = input.nextDouble();

				System.out.println("Enter second number");
				n2 = input.nextDouble();

				Scanner op = new Scanner(System.in);
				System.out.println("Enter your operation");
				operation = op.next();

				switch (operation) {
				case "+":
					System.out.println("Your answer is " + (n1 + n2));
					break;

				case "-":
					System.out.println("Your answer is " + (n1 - n2));
					break;

				case "/":
					System.out.println("Your answer is " + (n1 / n2));
					break;

				case "*":
					System.out.println("Your asnwer is " + (n1 * n2));
					break;

				default:

				}
				break;
			} catch (Exception e) {
				System.out.println("Unijeli ste slovo ili znak.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}

}