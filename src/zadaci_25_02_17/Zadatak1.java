package zadaci_25_02_17;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		int numbers[] = new int[100];
		int counts[] = new int[10];
		for(int i = 0;i<numbers.length;i++){
			//Generisemo random broj on 0 do 9
			numbers[i] = (int)(Math.random()*10);
			counts[numbers[i]]++;
		}
		// Ispisujemo koliko se koji broj ponovio puta
		for (int i = 0; i < counts.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + counts[i] + " puta");
		}
	}

}
