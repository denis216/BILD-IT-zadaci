package zadaci_09_02_17;

import java.io.File;
import java.io.FileNotFoundException;

public class Zadatak3 {

	public static void main(String[] args) throws FileNotFoundException {
		// u string upisujemo lokaciju fajla
		try {
			String str = "C:\\Users\\Denis\\git\\BILD-IT-zadaci\\src\\zadaci_09_02_17\\myFile.txt";
			File file = new File(str);

			// citamo iz fajla pomocu skenera pozivajuci fajl
			java.util.Scanner input = new java.util.Scanner(file);

			int character = 0;
			int word = 0;
			int line = 0;

			// brojimo karaktere rijeci i linije u fajlu
			while (input.hasNextLine()) {
				String str1 = input.nextLine();
				character += str1.length();
				line++;
				String array[] = str1.split(" ");
				word += array.length;
			}
			// Zatvoren skener
			input.close();

			System.out.println("Broj karaktera u vasem fajlu je " + character + " .");
			System.out.println("Broj rijeci u vasem fajlu je " + word + " .");
			System.out.println("Broj linija u vasem fajlu je " + line + " .");

		} catch (FileNotFoundException f) {
			System.out.println("Fajl nije pronadjen ! ! !");
		}
	}
}
