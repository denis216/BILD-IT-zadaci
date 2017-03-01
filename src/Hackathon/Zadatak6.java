package Hackathon;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		//Ne znam dali treba ne trazi se u zadatku da se uklone prazna mjeste u string
		// a ako treba koristimo str.replaceAll("\\s"," ");
		//Sa fajlovima nisam strucan a sad nemam vremena da radim sa bazom		
				Scanner input = new Scanner(System.in);
				System.out.print("Unesite string: ");
				String str = input.nextLine();
				int duzinaStringa = str.length();
				char prvoSlovo = '0';
				System.out.println("Uneseni string sadrzi " + duzinaStringa + " slova");
				for (int i = 0; i < str.length(); i++) {
					if (Character.isLetter(str.charAt(i))) {
						prvoSlovo = str.charAt(i);
						break;
					}
				}
				System.out.println("Prvo slovo stringa je " + prvoSlovo);
				//Stavio sam da broji i slova msm od viska glava ne boli :)
			}

		}
