package zadaci_08_02_17;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		//Importovanje Scanner-a
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj:");
		int num1 = input.nextInt();
		System.out.println("Unesite drugi broj:");
		int num2 = input.nextInt();
		
		//Prosledjujemo metodi dva broja koja smo unijeli num1 i num2 i printamo
		System.out.println("Za brojeve " + num1 + " i " + num2 + " najveci zajednici djelilac je " + max(num1, num2));
	}

	// Medota za izracunavanje najveceg zajednickog djelioca
	public static int max(int num1, int num2) {
		int max = 0;
		for (int i = 1; i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}
		return max;
	}

}
