package zadaci_09_02_17;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Importovanje Scanner-a
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja: ");
		int num = input.nextInt();
		numOfQuestions(num);
	}

	public static void numOfQuestions(int n) {
		int correct = 0;
		int inCorrect = 0;
		// Importovanje Scanner-a
		Scanner input = new Scanner(System.in);
		// prolazimo kroz petlju i pravimo dva random broja num1 i num2
		for (int i = 0; i < n; i++) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			System.out.println("Koliko je " + num1 + " - " + num2);
			int answer = input.nextInt();
			// provjeravamo ako je uneseni odgovor jednak rezultatu (num1-num2)
			// dodjeljujemo +1 brojacu tacnih odgovora a ukoliko nije
			// dodjeljujemo brojacu netacnih odgovora +1
			if (answer == (num1 - num2)) {
				System.out.println("Odgovor je tacan");
				correct++;
			} else {
				System.out.println("Odgovor nije tacan");
				inCorrect++;
			}
		}
		// ispis
		System.out.println();
		System.out.println("Broj tacnih odogovora je: " + correct);
		System.out.println("Broj netacnih odgovora je: " + inCorrect);
	}

}
