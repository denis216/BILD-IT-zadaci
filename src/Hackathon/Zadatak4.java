package Hackathon;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int[] novcici = {1,3,5};
	        System.out.println("Unesite sumu");
	        int sum = input.nextInt(); 
	        System.out.println("Potrebna su " + pronadjiMin(novcici, sum) + " novcica");
	}
	
	
	public static int pronadjiMin(final int[] novcic, final int suma) {
	    int[] minNovc = new int[suma + 1];
	    for (int i = 1; i <= suma; i++) {
	        minNovc[i] = Integer.MAX_VALUE - 1;
	    }

	    for (int j = 1; j <= suma; j++) {
	        for (int kovanca : novcic) {
	            if (j >= kovanca) {
	                minNovc[j] = Math.min(minNovc[j], minNovc[j - kovanca] + 1);
	            }
	        }
	    }
	    return minNovc[suma];
	}
}
