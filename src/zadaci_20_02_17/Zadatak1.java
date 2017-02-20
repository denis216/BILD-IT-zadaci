package zadaci_20_02_17;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//Petlja vrti sve dok je i manje od 3 tj. ispisuje tri random velika slova
		for (int i = 0; i < 3; i++) {
			System.out.print((char) ((int) (Math.random() * 26) + 65));
		}

		System.out.print("-");
		
		//Petlja vrti sve dok je i manje od 4 tj. ispisuje 4 random broja od 0 do 9 ukljucujuci i 9
		for (int i = 0; i < 4; i++) {
			System.out.print((int) (Math.random() * 10));

		}

	}

}
