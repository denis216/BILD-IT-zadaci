package zadaci_09_02_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Importovanje Scanner-a
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj koliko puta zelite baciti novcic ! ! !");
		int num = input.nextInt();
		//prosledjujemo metodi (num) koliko puta zelimo da se izvrsi bacanje novcica
		numberOfThrow(num);
	}

	public static void numberOfThrow(int n) {
		int head = 0;
		int letter = 0;
		//prolazimo kroz petlju i simuliramo uneseni broj puta bacanje novcanice
		for (int i = 0; i < n; i++) {
			// dobijamo random broj 0 ili 1
			int random = (int) (Math.random() * 2);
			if (random == 0) {
				head++;
			} else {
				letter++;
			}
		}
		// ispisujemo koliko puta je se pojavila glava odnosno pismo
		System.out.println("Glava je bila: " + head + " puta");
		System.out.println("Pismo je bilo: " + letter + " puta");
	}

}
