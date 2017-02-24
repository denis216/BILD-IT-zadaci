package zadaci_22_02_17;

public class Zadatak1 {

	public static void main(String[] args) {
		// Random broj od 1 do 12
		int randomNum = (int) (Math.random() * 12);

		// Niz u kojem smjestamo mjesece
		String[] month = { "Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "Avgust", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		System.out.println(month[randomNum]);
	}

}
