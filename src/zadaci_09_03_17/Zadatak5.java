package zadaci_09_03_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double amount, interestRate;
		int numberOfYears;
		
		try {
			System.out.println("Enter loan amount, annual interest rate and number of years: ");
			amount = input.nextDouble();
			interestRate = input.nextDouble();
			numberOfYears = input.nextInt();
			
			new Loan(interestRate, numberOfYears, amount);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("You did not enter number!");
		}
		
		input.close();
	}
}