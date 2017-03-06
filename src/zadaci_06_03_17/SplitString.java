package zadaci_06_03_17;
import java.util.ArrayList;

public class SplitString {
	public static boolean contains(String regex, char ch) {
		String bl = ch + "";
		if (bl.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

	public static String[] split(String s, String regex) {
		// Lista koja ce da sadrzi substring stringa s, razdvojene karakterom
		// regex
		ArrayList<String> splitStringList = new ArrayList<>();
		// String koji se sadrzati karaktere dok se ne pojavi odredjen karakter
		String currentString = "";

		// Petlja kojom prolazimo kroz string s
		for (int i = 0; i < s.length(); i++) {
			if (contains(regex, s.charAt(i))) {
				if (currentString.length() != 0) {
					splitStringList.add(currentString);
					splitStringList.add(s.charAt(i) + "");
					currentString = "";
				}
			} else {
				currentString += s.charAt(i);
				if (i == s.length() - 1) {
					splitStringList.add(currentString);
				}
			}
		}

		String[] splitString = new String[splitStringList.size()];
		splitString = splitStringList.toArray(splitString);
		return splitString;
	}

	public static void main(String[] args) {
		String str = "ab#12#453";
		String regex = "#";
		String str1 = "a?b?gf#e";
		String regex1 = "[?#]";

		System.out.println("String: " + str);
		System.out.println("Regex: " + regex);
		System.out.print("Split: ");

		// Nizom stampamo novi string
		String[] split = split(str, regex);
		for (String s : split) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("String: " + str1);
		System.out.println("Regex: " + regex1);
		System.out.print("Split: ");

		// Nizom stampamo novi string
		String[] split1 = split(str1, regex1);
		for (String s : split1) {
			System.out.print(s + " ");
		}
	}
}