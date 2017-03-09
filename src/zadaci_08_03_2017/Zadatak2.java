package zadaci_08_03_2017;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite 5 brojeva u listu: ");
				for (int i = 0; i < 5; i++) {
					list.add(input.nextInt());
				}
				sort(list);
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo:");
				list.clear();
				input.nextLine();

			}

		}
	}

	// Metoda koja sortira brojeve
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
