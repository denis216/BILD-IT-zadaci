package zadaci_15_02_2017;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Importovanje skenera
		Scanner input = new Scanner(System.in);
		//Pravimo tri random broja od 0 do 9
		int broj1 = (int) (Math.random() * 10);
		int broj2 = (int) (Math.random() * 10);
		int broj3 = (int) (Math.random() * 10);
		System.out.println("Koliko je " + broj1 + " + " + broj2 + " + " + broj3 + " ? ? ?");
		while (true) {
			try {
				int odgovor = input.nextInt();
				//Ako odgovor nije jednak zbiru brojeva baca nas u else i pita ponovo sve dok ne unesemo tacan odgovor.
				if (odgovor == (broj1 + broj2 + broj3)) {
					System.out.println("Odgovor je tacan.");
					break;
				} else {
					System.out.println("Odgovor nije tacan.Pokusajte ponovo");
					System.out.println("Koliko je " + broj1 + " + " + broj2 + " + " + broj3 + " ? ? ?");

				}
				//Hvata exceprion ukoliko korsinik unese znak ili slovo
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				System.out.println("Koliko je " + broj1 + " + " + broj2 + " + " + broj3 + " ? ? ?");
				input.nextLine();
			}
		}
		System.out.println("Svaka cast unjeli ste tacan odgovor");
	}

}
