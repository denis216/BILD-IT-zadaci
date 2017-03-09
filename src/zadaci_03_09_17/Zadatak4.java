package zadaci_03_09_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			int random = (int) (Math.random() * 10);
			num[i] = random;
		}

		System.out.println("Enter the index of the array");
		try {
			int index = input.nextInt();
			System.out.println(num[index]);
		} catch (IndexOutOfBoundsException i) {
			System.out.println("Out of Bounds !!!");
		} catch (InputMismatchException e) {
			System.out.println("Wrong input !!!");
		}

	}
}