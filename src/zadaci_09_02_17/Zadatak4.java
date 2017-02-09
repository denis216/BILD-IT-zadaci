package zadaci_09_02_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Importovanje Scanner-a
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite velicinu n * n matrice");
		int n = input.nextInt();
		// pozivamo metodu i prosledjujemo joj (n)
		printMatrix(n);
	}

	public static void printMatrix(int n) {
		
		for (int i = 0; i < n; i++) { //petlja za redove
			for (int j = 0; j < n; j++) { //petlja za kolone
				int random = (int) (Math.random() * 2); // generise random broj 0 ili 1
				System.out.print(random + " ");
			}
			System.out.println();
		}
	}
}
