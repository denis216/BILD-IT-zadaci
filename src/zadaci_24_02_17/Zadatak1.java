package zadaci_24_02_17;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite cijeli broj izmedju 0 i 127:");
				int broj = input.nextInt();
				char ch = (char) broj;
				//Ako je broj manji od 0 ili veci od 127 printa nam poruku da smo unijeli pogresan broj
				if (broj < 0 || broj > 127) {
					System.out.println("Uneli ste pogresan broj!");
				} else {
					System.out.println("Karakter na tom broju je " + ch);
					break;
				}

			} catch (Exception e) {
				System.out.println("Netacan unos.Pokusajte ponovo.");
				input.nextLine();
			}
		}
	}
}
