package zadaci_14_02_17;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Uzimamo poterbne podatke od korisnika
		double iznosInvesticije = 0;
		double godisnjaInteresnaStopa = 0;
		double brojGodina = 0;
		double buducaVrednostInvesticije = 0;
		while (true) {
			try {
				System.out.println("Molimo unesite iznos vase investicije: ");
				iznosInvesticije = input.nextDouble();
				System.out.println("Molimo unesite iznos godisnju interesnu stopu: ");
				godisnjaInteresnaStopa = input.nextDouble() / 12;
				System.out.println("Molimo unesite iznos broj godina: ");
				brojGodina = input.nextDouble();
				break;
			}

			catch (Exception e) {
				System.out.println("Pogresan unos ! Pokusajte ponovo");
				input.nextLine();
			}
		}
		// Izracunamo buducu investiciju, prebacujemo u format koji se trazi i
		// ispisujemo korisniku
		buducaVrednostInvesticije = (iznosInvesticije * Math.pow(1 + godisnjaInteresnaStopa / 100, brojGodina * 12));
		buducaVrednostInvesticije = Double.parseDouble(new DecimalFormat("##.##").format(buducaVrednostInvesticije));
		System.out.println("Buduca vrednost investicije je " + buducaVrednostInvesticije);
	}
}
