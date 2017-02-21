package zadaci_21_02_17;
import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int broj = 0;
		while (true) {
			try {
				System.out.print("Unesite cijeli broja: ");
				broj = input.nextInt();
				while (broj < 0) {
					System.out.println("Unesite broj koji je veci od (0)");
					broj = input.nextInt();
				}
				break;

			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
		reverse(broj);

	}

	public static void reverse(int number) {

		String str = number + "";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}
}
