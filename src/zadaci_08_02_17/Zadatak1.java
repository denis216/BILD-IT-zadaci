package zadaci_08_02_17;
import java.util.ArrayList;
import java.util.Collections;

public class Zadatak1 {

	public static void main(String[] args) {

		// Napravljena ArrayLista u koju smo dodali elemente
		ArrayList<Integer> list = new ArrayList<>();
		list.add(79);
		list.add(44);
		list.add(14);
		list.add(70);
		list.add(68);
		list.add(0);
		list.add(29);

		if(max(list)==null){
			System.out.println("null");
		}
		else{
			// Pozivanje metode max i ispis korisniku
			System.out.println("Najveci broj na vasoj listi je " + max(list));
		}			

	}

	// Metoda koja prolazi kroz listu sortira listu koristeci se
	// Collection metodom i dodaje varijabli max najveci broj u listi
	private static Integer max(ArrayList<Integer> list) {
		//Ukoliko je lista prazna metoda vraca null
		if(list == null || list.size() == 0) {
			return null; 
		}
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			max = Collections.max(list);

		}
		return max;

	}

}
