package zadaci_11_02_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// Pravimo skener i uzimamo unos od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri broja !");
		while (true) {
			try {
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int num3 = input.nextInt();
				displaySortedNumbers(num1, num2, num3);
				break;
			}

			catch (InputMismatchException e) {  //Ako korisnik unese slovo umjesto broja program ce ga pitati 
												//da ponovo unese brojeve
	System.out.println("Nemoguc unos! Dozvoljen je unos samo brojeva a vi se unjeli nesto sto nije broj.Pokusaj ponovo");
				input.nextLine();
			}
		}
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp = 0;
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 > num3) {
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		System.out.println("Sortirani brojevi od manjeg ka vecem su : " + num1 + " , " + num2 + " , " + num3);

	}

}
