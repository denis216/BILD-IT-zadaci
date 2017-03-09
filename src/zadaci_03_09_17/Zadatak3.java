package zadaci_03_09_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite broj1 i broj2");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				while (num1 <= -1000 || num1 >= 1000 || num2 <= -1000 || num2 >= 1000) {
					System.out.println("Unesite brojeve u rasponu od -1000 do 1000: ");
					num1 = input.nextInt();
					num2 = input.nextInt();
				}
				System.out.println("Suma je: " + (num1 + num2));
				break;
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}

	}

}
