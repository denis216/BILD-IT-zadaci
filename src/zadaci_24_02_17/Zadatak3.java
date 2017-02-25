package zadaci_24_02_17;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//short ide od -32768 do 32767
		while (true) {
			try {
				System.out.println("Unesite short broj u rasponu od – 32,768 do 32,767:");
				short broj = input.nextShort();
				//Zanimljiv ovaj string.format hehe do juce nisam ni znao da postoji :).
				System.out.println(String.format("%16s", Integer.toBinaryString((broj + 256) % 256)).replace(' ', '0'));
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}
}
