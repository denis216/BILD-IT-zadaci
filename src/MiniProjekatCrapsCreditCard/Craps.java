package MiniProjekatCrapsCreditCard;
import java.util.Scanner;

public class Craps {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dice1 = 0, dice2 = 0;
		dice1 = (int) (1 + Math.random() * 6);
		dice2 = (int) (1 + Math.random() * 6);
		System.out.println("Dobili ste " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
		/*
		 * Uzimamo odredjene brojeve za pobjedu i poraz, i ako je zbir brojeva
		 * taj igrac gubi ili pobjedjuje
		 */
		if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {
			System.out.println("Pobijedili ste.Cestitamo!");
		} else if (dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
			System.out.println("Dobili ste, " + (dice1 + dice2) + " Izgubili ste!");
		} else {
			/*
			 * Dobili smo zbir prethodnog bacanja, i moramo dobiti taj broj na
			 * sledecem bacanj kad se saberu kockice, petlja se vrti sve dok se
			 * to ne desi i igrac pobijedi.
			 */
			int kockicaBacena = (dice1 + dice2);
			System.out.println("Morate dobiti " + (dice1 + dice2) + " Bacite kockicu ponovo.");
			while (true) {
				dice1 = (int) (1 + Math.random() * 6);
				dice2 = (int) (1 + Math.random() * 6);
				if (kockicaBacena == (dice1 + dice2)) {
					System.out.println("Dobili ste, " + (dice1 + dice2) + " pobijedili ste!");
					break;
				} else if ((dice1 + dice2) == 7) {
					System.out.println("Dobili ste, " + (dice1 + dice2) + " Izgubili ste!");
					break;
				}
			}
		}
	}
}