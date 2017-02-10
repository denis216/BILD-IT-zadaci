package zadaci_10_02_2017;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Importovanje skenera
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brojeve u 3x3 2D niz ! ! !");
		double[][] niz = new double[3][3];
		//Unosimo brojeve u niz
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				niz[i][j] = input.nextDouble();
			}

		}
		//pozivamo metodu koja pronalazi najveci element u nizu
		int larg[] = locateLargest(niz);
		System.out.print("Najveci element u nizu nalazi se na mjestu " + Arrays.toString(larg));
		
	}


	public static int[] locateLargest(double[][] a) {
		// pravimo niz koji ce sadrzavati indeks najveceg elementa
		int largest[] = new int[2];
		double max = a[0][0];
		//Prolazimo kroz 2D niz for petljom
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					//index reda
					largest[0] = i;
					//index kolone
					largest[1] = j;
				}
			}
		}
		return largest;
	}
}

