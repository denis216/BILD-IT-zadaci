package zadaci_21_02_17;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Importujemo scanner
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				// pitati korisnika da unese tezinu i cijenu prvog paketa
				System.out.print("Unesite tezinu i cijenu prvog paketa: ");

				// uzeti unos od korisnika i dodijeliti varijablama
				double tezinaPrvogPaketa = input.nextDouble();
				double cijenaPrvogPaket = input.nextDouble();
				while(tezinaPrvogPaketa<=0 || cijenaPrvogPaket <=0){
					System.out.println("Tezina ili cijena moraju biti veci od (0).Pokusajte ponovo");
					System.out.print("Unesite tezinu i cijenu prvog paketa: ");
					tezinaPrvogPaketa = input.nextDouble();
					cijenaPrvogPaket = input.nextDouble();
				}

				// pitati korisnika da unese tezinu i cijenu drugog paketa
				System.out.print("Unesite tezinu i cijenu drugog paketa: ");

				// uzeti unos od korisnika i dodijeliti varijablama
				double tezinaDrugogPaketa = input.nextDouble();
				double cijenaDrugogPaket = input.nextDouble();
				while(tezinaDrugogPaketa <=0 || cijenaDrugogPaket<=0){
					System.out.println("Tezina ili cijena moraju biti veci od (0).Pokusajte ponovo");
					System.out.print("Unesite tezinu i cijenu drugog paketa: ");
					tezinaDrugogPaketa = input.nextDouble();
					cijenaDrugogPaket = input.nextDouble();
				}

				// izracunati odnos tezine i cijene prvog paketa
				double odnosPrvogPaketa = tezinaPrvogPaketa / cijenaPrvogPaket;
				// izracunati odnos tezine i cijene drugog paketa
				double odnosDrugogPaketa = tezinaDrugogPaketa / cijenaDrugogPaket;

				// uporediti odnose tezina i cijena paketa i ispisati poruku
				// korisniku
				if (odnosPrvogPaketa > odnosDrugogPaketa) {
					System.out.println("Bolju cijenu ima prvi paket.");
				} else if (odnosPrvogPaketa == odnosDrugogPaketa) {
					System.out.println("Cijene su jednake.");
				} else {
					System.out.println("Bolju cijenu ima drugi paket.");
				}
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unos.Pokusajte ponovo");
				input.nextLine();
			}
		}
	}
}
