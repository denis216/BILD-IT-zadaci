package zadaci_28_02_17;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		double[][] array = new double[3][3];
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite vrijednost u 3x3 matricu red po red.Dozvoljen je unos i negativnih brojeva: ");
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						array[i][j] = input.nextDouble();
						
					}
				}
				System.out.println("Niz sortiran po redovima je:");
				for (int i = 0; i < array.length; i++) {
					//Pozivamo arrays.sort kako bi sortirali redove
					Arrays.sort(array[i]);
					for (int j = 0; j < array[i].length; j++) {
						System.out.print(array[i][j] + " ");
						
					}
					System.out.println();
				}
				break;
			} catch (Exception e) {
				System.out.println("Netacan unos ! Pokusate ponovo !");
				input.nextLine();
			}
		}
	}
	
}

