package zadaci_25_02_17;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		//Niz koji drzi brojeve od 1 do 54 iskljucujuci 1 i 54
		int[] lista = new int[52];
		for (int i = 0; i < 52; i++) {
			lista[i] = i + 2;
		}
		System.out.println("Random broj je - " + getRandom(lista));
	}

	//Metoda koja vraca radnom broj iz niza ili 0 ako je niz prazan
	public static int getRandom(int... numbers) {
		int randomNum = 0;
		if (numbers.length == 0) {
			return 0;
		} else {
			randomNum = (int) (Math.random() * 52);
			return numbers[randomNum];
		}
	}

}