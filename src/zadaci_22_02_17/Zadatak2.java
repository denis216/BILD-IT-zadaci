package zadaci_22_02_17;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 0 za (makaze), 1 za (papir), 2 za (bunar): ");
		while (true) {
			try {
				int computer = (int) (Math.random() * 3);
				int user = input.nextInt();
				while(user <0 || user >2){
					System.out.println("Unesite brojeve u rasponu od 0 do 2");
					user = input.nextInt();
				}
				// Ispod su sve provjere da ne komentarisem svaku posebno :)
				if (user == 0 && computer == 2) {
					System.out.println("Izabrali ste makaze.Racunar je izabrao bunar.Racunar je pobjedio");
				} else if (user == 0 && computer == 1) {
					System.out.println("Izabrali ste makaze.Racunar je izabrao papir.Vi ste pobjedili");
				} else if (user == 0 && computer == 0) {
					System.out.println("Izabrali ste makaze.Racunar je izabrao makaze.Nerijeseno");
				}
				if (user == 1 && computer == 2) {
					System.out.println("Izabrali ste papir.Racunar je izabrao bunar.Vi ste pobjedili");
				} else if (user == 1 && computer == 1) {
					System.out.println("Izabrali ste papir.Racunar je izabrao papir.Nerijeseno");
				} else if (user == 1 && computer == 0) {
					System.out.println("Izabrali ste papir.Racunar je izabrao makaze.Racunar je pobjedio");
				}
				if (user == 2 && computer == 2) {
					System.out.println("Izabrali ste bunar.Racunar je izabrao bunar.Nerijeseno");
				} else if (user == 2 && computer == 1) {
					System.out.println("Izabrali ste bunar.Racunar je izabrao papir.Racunar je pobjedio");
				} else if (user == 2 && computer == 0) {
					System.out.println("Izabrali ste bunar.Racunar je izabrao makaze.Vi ste pobjedili");
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unons.Pokusajte ponovo...");
				// Ako baci exception omogucava ponovni unos
				input.nextLine();
			}
		}
	}
}