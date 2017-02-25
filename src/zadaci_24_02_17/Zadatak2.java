package zadaci_24_02_17;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		//Mislim da je suvisno pisati komenare u ovaj zadatak :)
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite neki karakter:");
				//Uzimamo karakter kao input od korisnika
				char ch = input.next().charAt(0);
				//Pretvaramo karakter u broj
				int broj = ch;
				System.out.println("Unijeli ste slovo " + ch + " Broj koji se nalazi na mjestu je " + broj);
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}
}
