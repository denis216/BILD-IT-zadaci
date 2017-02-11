package zadaci_11_02_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		int x = 1;
		int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		d1 = d2 = d3 = d4 = d5 = d6 = d7 = d8 = d9 = 0;
		do { // U slucaju da je unos pogresan resetuje program
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Unesite 9 brojeva jedan po jedan.Nakon svakog unesenog broja pritisnite ENTER ! ! ! ");
				d1 = input.nextInt();
				d2 = input.nextInt();
				d3 = input.nextInt();
				d4 = input.nextInt();
				d5 = input.nextInt();
				d6 = input.nextInt();
				d7 = input.nextInt();
				d8 = input.nextInt();
				d9 = input.nextInt();
				x = 0;

			} catch (Exception e) {
				System.out.println("Pogresan unos! Pokusajte ponovo unjeti 9 brojeva");
			}
		} while (x == 1);
		int num = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if (num == 10) {
			System.out.print("ISBN broj je : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + 'X');
		} else
			System.out.print("ISBN broj je : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + num);
	}
}
