package zadaci_10_03_17;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		// U string upisujemo lokaciju fajla
		String str = "C:/Users/Denis/Desktop/Java Workspace 1/Imenik/file.txt";
		File file = new File(str);

		// Citamo iz fajla pomocu skenera, pozivajuci fajl
		Scanner input = new Scanner(file);

		int character = 0, word = 0, line = 0;

		// Brojimo karaktere, rijeci i linije u fajlu
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
	}
}
