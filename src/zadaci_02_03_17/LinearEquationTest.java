package zadaci_02_03_17;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearEquationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		
		while(true) {

			try {
				System.out.print("Unesite vrednosti za a, b, c, d, e i f: ");
				a = input.nextDouble();
				b = input.nextDouble();
				c = input.nextDouble();
				d = input.nextDouble();
				e = input.nextDouble();
				f = input.nextDouble();
				
				while(a < -100 || a > 100 || b < -100 || b > 100 || c < -100 || c > 100 || 
						d < -100 || d > 100 || e < -100 || e > 100 || f < -100 || f > 100) {
					System.out.println("Unesite broj izmedju -100 and 100: ");
					a = input.nextDouble();
					b = input.nextDouble();
					c = input.nextDouble();
				}
				
				break;
			}
			catch(InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		}
		//Novi objekat le
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		
		if(le.isSolvable()) {
			System.out.println("X is: " + le.getX());
			System.out.println("Y is: " + le.getY());
		}
		else
			System.out.println("Jednacina nema rijesenja...");
		
	}
}

	
