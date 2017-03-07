package zadaci_07_03_2017;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("Orginal list is: " + list + "\n");
		System.out.println("Random numbers from list are: ");
		shuffle(list);

	}

	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
