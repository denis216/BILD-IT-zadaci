package zadaci_24_02_17;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Unesite broj i duzinu: ");
				int n = input.nextInt();
				int width = input.nextInt();
				//Prontamo i pozivamo metodu format...
				System.out.println(format(n, width));
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}
	//Metoda foramt vraca formatiran string koristeci specifican format
	public static String format(int number, int width) {
		return String.format("%0" + width + "d", number);

	}

}
