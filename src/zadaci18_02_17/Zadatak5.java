package zadaci18_02_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		java.util.ArrayList<Integer> lista = new java.util.ArrayList<>();
		int broj = -1;
		//While prelja vrti sve dok ne unesemo 0
		while (broj != 0) {
			try {
				System.out.println("Unesite broj u listu. (0) prekida unos:");
				broj = input.nextInt();
				//Ako je uneseni broj 0 prekida dodavanje u listu
				if (broj == 0) {
					break;
				} else {
					lista.add(broj);
				}
			} catch (Exception ex) {
				System.out.println("Unijeli ste nesto sto nije broj.Pokusajte ponovo !!! : ");
				input.nextLine();
			}
		}
		int negativni = 0;
		int suma = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < 0) {
				negativni++;
			}
			suma += lista.get(i);
		}
		System.out.println("Pozitivnih brojeva ima: " + (lista.size() - negativni));
		System.out.println("Negativnih brojeva ima: " + negativni);
		System.out.println("Suma svih unesenih brojeva: " + suma);
		System.out.println("Prosjek unesenih brojeva: " + ((double) suma / lista.size()));
		input.close();
	}

}