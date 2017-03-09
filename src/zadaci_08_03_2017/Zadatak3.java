package zadaci_08_03_2017;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite 5 brojeva u listu: ");
				for (int i = 0; i < 5; i++) {
					list.add(input.nextDouble());
				}
				System.out.println("Suma unesenih brojeva je " + sum(list));
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo:");
				list.clear();
				input.nextLine();
			}
		}
	}

	// Metoda vraca sumu unesenih brojeva
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;

	}

}
