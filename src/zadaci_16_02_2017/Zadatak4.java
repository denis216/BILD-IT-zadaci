package zadaci_16_02_2017;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Importovanje skenera
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neodredjen broj brojeva. Unos prekida 0");
		int najVeciBrojac = 1;
		int najVeci = 0;
		int broj = 0;
		//Petlja se izvrsava dok korisnik ne unese odgovarajuce vrijednosti
		while (true) {
			try {
				while ((broj = input.nextInt()) != 0) {
					if (broj > najVeci) {
						najVeci = broj;
						najVeciBrojac = 1;
					} else if (broj == najVeci) {
						najVeciBrojac++;
					}

				}
				System.out.println("Najveci broj je " + najVeci + " i ponovio se " + najVeciBrojac + " puta");
				break;
			}
			// U catch-u sam resetovao varijable da ako unesemo 5 5 fdfdfd izbaci poruku 
			// i krece iz pocetka a ako zelimo da ne krece ispocetka da pamti sve sto smo unijeli
			// samo izbaciti ove dvije varijable iz catch-a :)
			 catch (Exception e) {
				System.out.println("Netacan unos.Pokusajte ponovo");
				
				input.nextLine();


			 }
			}
		}
	}

