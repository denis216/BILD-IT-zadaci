package zadaci_24_02_17;
import java.util.HashSet;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite 10 cijelih brojeva");
				// Pravimo listu u koju se ne unose dupli brojevi,i od korisnika
				// uzimamo brojeve
				HashSet<Integer> list = new HashSet<Integer>();
				for (int i = 0; i < 10; i++) {
					list.add(input.nextInt());
				}
				// Stampamo listu i velicinu liste
				System.out.println("Jedinstveni brojevi su " + list);
				System.out.println("Jedinstvenih brojeva imamo " + list.size());
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}
}
