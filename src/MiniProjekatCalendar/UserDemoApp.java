package MiniProjekatCalendar;

import java.util.Scanner;

public class UserDemoApp {

	public static void main(String[] args, String log,String pass) {
		User u = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("Dobrodosli " + log);
		boolean engine = true;
		while (engine) {
			System.out.println("1. Pregled mjeseca  2. Pregled podsjetnika  3.Novi podsjetnik 4. Podsjetnik za izabran dan  5.Izlaz");
			String opcija = input.next();
			switch (opcija) {
			case "1":
				//Pozivamo main MyMonth
				MyMonth.main(args);
				break;
			case "2":
				//Pozivamo metodu za prikaz nota
				u.showNote(log, pass);
				break;
			case "3":
				System.out.println("Unesite datum podsjetnika (format datuma je yy/mm/dd)");
				String datumPodsjetnika = input.nextLine();
				datumPodsjetnika = input.nextLine();
				System.out.println("Unesite novi podsjetnik");
				String newNote = input.nextLine();
				//Prosledjujemo medoti addNewNote kako bi dodali novi note
				u.addNewNote(log, pass, newNote,datumPodsjetnika);
				break;
			case "4":
				System.out.println("Unesite datum u (formatu yy/mm/dd)");
				String datumPodsjetnika2 = input.nextLine();
				datumPodsjetnika2 = input.nextLine();
				//Pozivamo metodu showIzabranDan da nam printa podsjetnik samo za taj dan ako postoji
				u.showIzabranDan(log,pass,datumPodsjetnika2);
				break;
			case "5":
				engine = false;
			default:
				break;
			}
		}

	}

}				
				
