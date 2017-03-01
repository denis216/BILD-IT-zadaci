package Hackathon;
import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.length() <= 55)
				System.out.println(line);
			else {
				line = line.substring(0, 40);
				for (int i = line.length() - 1; i >= 0; i--) {
					if (line.charAt(i) != ' ')
						line = line.substring(0, i);
					else {
						line = line.substring(0, i);
						break;
					}
				}
				line = line + "...... < Read More >";

				System.out.println(line);
			}
		}
	}
}
