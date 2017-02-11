package zadaci_11_02_17;

public class Zadatak4 {

	public static void main(String[] args) {

		//pozivamo medotu
		printCharactersAndNumbers();
	}
	public static void printCharactersAndNumbers() {
		int counter = 0;
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * 10) + " "); //printamo brojeve od 0 do 9
			counter++;
			if (counter == 10) {		//ako je count 10 prelazimo u novi red
				System.out.println();
				counter = 0;		//resetujemo brojac
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.print((char) ((int) (Math.random() * 26) + 65) + " "); //printamo slova velika
			counter++;
			if (counter == 10) {		//ako je count 10 prelazimo u novi red
				System.out.println();
				counter = 0;		//resetujemo brojac
			}

		}
		
	}

}
