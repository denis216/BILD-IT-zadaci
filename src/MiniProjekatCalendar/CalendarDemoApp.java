package MiniProjekatCalendar;

import java.util.Scanner;

public class CalendarDemoApp {

	public static void main(String[] args) {
		User u = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("DOBRODOSLI U PODSJETNIK");
		boolean engine = true;
		while(true){
		try {
			while (engine) {
				System.out.println("1. Ulogujte se\t2. Registrujte se \t3. Izadji...");
				int opcija = input.nextInt();
				switch (opcija) {
				case 1:
					System.out.println("Unesite ime: ");
					String ime = input.nextLine();
					ime = input.nextLine();
					System.out.println("Unesite sifru: ");
					String sifra = input.nextLine();
					//Ako je uneseno ime i sifra validno pozivamo main UserDemoApp
					if (u.isValid(ime, sifra) == true) {
						UserDemoApp.main(args,ime,sifra);
					} else{
						System.out.println("Login podaci su neispravni pokusajte ponovo ! ");
					}
					break;
					//Case 2 koristimo za registraciju
				case 2:
					System.out.println("Unesite zeljeno ime: ");
					String zeljenoIme = input.nextLine();
					zeljenoIme = input.nextLine();
					System.out.println("Unesite zeljenu sifru: ");
					String zeljenaSifra = input.nextLine();
					u.add(zeljenoIme, zeljenaSifra);
					break;
					//Case 3 prekidamo rad programa
				case 3:
					engine = false;
				default:
					break;
				}
			}
			break;
		} catch (Exception e) {
			System.out.println("Neodgovarajuci unos ! ");
			input.nextLine();

		}
		}
	}

}
