package zadaci_08_03_2017;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite 5 brojeva u prvu listu: ");
				for (int i = 0; i < 5; i++) {
					list1.add(input.nextInt());
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo:");
				list1.clear();
				input.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("Unesite 5 brojeva u drugu listu: ");
				for (int i = 0; i < 5; i++) {
					list2.add(input.nextInt());
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo:");
				list2.clear();
				input.nextLine();
			}
		}
		System.out.println(union(list1, list2));
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> union = new ArrayList<>();
		union.addAll(list1);
		union.addAll(list2);
		return union;
		// A MOZE I NA OVAJ NACIN JEDNOSTAVNI :) samo ga nisam smjeo napisati da
		// ne reknes da san lijen :P

		// list1.addAll(list2);
		// return list1;
	}

}
