package Hackathon;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite neki string.Nakon unosa sva dupla slova ce biti uklonjena:");
		String str = input.nextLine();
		System.out.println("Vas string bez slova koja se ponavljaju je:");
		System.out.println(remove(str));
	}

	public static String remove(String str) {
		String novi = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i+1)) {
				novi += str.charAt(i);
			}

		}

		return novi;
	}
}
