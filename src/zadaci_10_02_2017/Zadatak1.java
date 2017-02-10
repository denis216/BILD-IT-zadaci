package zadaci_10_02_2017;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//Importovanje skenera
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetni broj");
		int first = input.nextInt();
		System.out.println("Unesite krajnji broj");
		int last = input.nextInt();
		//Pozivanje metode za dobijanje prostog broja
		ispisiBrojeve(first, last);
	}
	
	//Metoda za racunanje prostih brojeva
	public static void ispisiBrojeve (int a,int b){
		int counter = 1;
		//For petlja koja ide od pocetnog broja do krajnjeg broja
		for (int i = a; i <= b; i++) {
			int number = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					number++;
				}
			}
			if (number == 2) {
				if (counter % 10 == 0) {
					System.out.println(i);
				} else {

					System.out.print(i + " ");
				}
				counter++;
			}
		}

	}

}

