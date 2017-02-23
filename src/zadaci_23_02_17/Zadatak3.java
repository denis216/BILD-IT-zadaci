package zadaci_23_02_17;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ssn = "";
		System.out.println("Unesite Social Security Number (SSN) u formatu DDD-DD-DDDD ukljucujuci i crtice:");
		ssn = input.nextLine();
		boolean engine = true;
		while (engine) {
			if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
				System.out.println(ssn + " je validan SSN broj");
				engine = false;
			} else {
				System.out.println(ssn + " nije validan broj.Probajte ponovo:");
				ssn = input.nextLine();
			}
		}
	}
}