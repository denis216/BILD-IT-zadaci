package zadaci_13_03_17;

public class Zadatak2 {

	public static void main(String[] args) {
		String[] array = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] array1 = { "Srce", "Pik", "Tref", "Kocka" };
		//Printa random 
		System.out.print(array[(int) (Math.random() * 13)] + " " + array1[(int) (Math.random() * 4)]);
	}

}
