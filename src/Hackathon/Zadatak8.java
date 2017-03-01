package Hackathon;
import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Kao sto sam rekao nisam strucan sa fajlovima a za bazu nemam vremena :).
		System.out.println("Unesite zeljeni string");
		 String str = input.nextLine();
		 System.out.println("Unesite zeljeni karakter koji zelite ukloniti iz stringa");
	        char x =input.next().charAt(0);
	        System.out.println(removeChr(str,x));
	    }

	    public static String removeChr(String str, char x){
	        StringBuilder strBuilder = new StringBuilder();
	        char[] rmString = str.toCharArray();
	        for(int i=0; i<rmString.length; i++){
	            if(rmString[i] == x){

	            } else {
	                strBuilder.append(rmString[i]);
	            }
	        }
	        return strBuilder.toString();
	    }
	}
