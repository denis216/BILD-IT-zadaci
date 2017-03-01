package Hackathon;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string.Pritiskom na ENTER ce te zavrsiti vas unos");
		String str = input.nextLine();
		String normalan = "";
		normalan = str.replaceAll("[^a-zA-Z]+", " ");

		System.out.println(normalan);

	}

}
