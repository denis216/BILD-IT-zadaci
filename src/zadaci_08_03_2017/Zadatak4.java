package zadaci_08_03_2017;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Unesite 10 brojeva u listu: ");
				for (int i = 0; i < 10; i++) {
					list.add(input.nextInt());
				}
				removeDuplicate(list);
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo:");
				list.clear();
				input.nextLine();
			}
		}
		
		
	}
	public static void removeDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> removed = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(!removed.contains(list.get(i))){
				removed.add(list.get(i));
			}
		}
		for (int i = 0; i < removed.size(); i++) {
			System.out.print(removed.get(i) + " ");
		}
	}
	
	//Moglo je i na ovaj nacin :)
	
	/*
	 * public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.indexOf(i) != list.lastIndexOf(i)) {
				list.remove(list.lastIndexOf(i));
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	*/

}
