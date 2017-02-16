package zadaci_16_02_2017;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Importovanje skenera
		Scanner input = new Scanner(System.in);
		String[] dani = { "ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja" };
		//Petlja se izvrsava dok korisnik ne unese odgovarajuce vrijednosti
		while (true) {
			System.out.println(
					"Unesite cijeli broj za danasnji dan u sedmici (0 za ponedeljak, 1 za utorak, \n2 za sredu, 3 za cetvrtak, 4 za petak, 5 za subotu, 6 za nedelju");
			try {
				int dan = input.nextInt();
				while (dan < 0 || dan > 7) {
					System.out.println("Netacan unos dan ne moze biti negativan ili veci od 6 pokusajte ponovo:");
					dan = input.nextInt();
				}

				System.out.println("Unesite broj dana nakon danasnjeg dana:");
				int brojDana = input.nextInt();
				while (brojDana < 0 || brojDana > 7) {
					System.out.println("Netacan unos broj dan ne moze biti negativan ili veci od 6 pokusajte ponovo:");
					brojDana = input.nextInt();
				}
				int sledeci = (dan + brojDana) % 7;
				System.out.println("Danas je " + dani[dan] + " a dan u buducnosti je " + dani[sledeci]);
				break;
			} catch (Exception e) {
				System.out.println("Nemoguc unos pokusajte ponovo");
				input.nextLine();
			}

		}
	}

}
