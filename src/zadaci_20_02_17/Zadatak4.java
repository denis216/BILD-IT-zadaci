package zadaci_20_02_17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		//Pravimo array listu Integra
		ArrayList<Integer> broj = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri broja:");
		while (true) {
			try {
				//Dodajemo u listu brojeve po zelji
				broj.add(input.nextInt());
				broj.add(input.nextInt());
				broj.add(input.nextInt());
				//Pozivamo metodu
				sortNumbers(broj);
				break;
			}
			catch (Exception e) {
				System.out.println("Nemoguc unos! Dozvoljeno je unosenje samo brojeva.Pokusajte ponovo iz pocetka");
				input.nextLine();
			}
		}

	}
	//Metoda za sortiranje brojeva
	public static void sortNumbers(ArrayList<Integer> array) {
		Collections.sort(array);
		System.out.println("Sortirani brojevi u rastucem redosledu su: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(array.get(i));
		}

	}

}
