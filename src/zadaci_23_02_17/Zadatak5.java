package zadaci_23_02_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Unesite cijeli broj:");
				int n = input.nextInt();
				while (n < 2 || n >= 10) {
					System.out.println("Unesite samo pozitivan broj izmedju 2 i 10: ");
					n = input.nextInt();
				}
				for (int i = 1; i <= n; i++) {
					// printing spaces, 2 at a time from j=1 to j= n-i
					for (int j = 1; j <= (n - i); j++) {
						System.out.print("  ");
					}
					for (int j = i; j >= 1; j--) {
						System.out.print(j + " ");
					}
					for (int j = 2; j <= i; j++) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}
}
