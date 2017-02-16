package zadaci_16_02_2017;

public class Zadatak5 {
	public static String convertMillis(long millis) {
		long seconds = (int) (millis / 1000) % 60;
		long minutes = (int) ((millis / (1000 * 60)) % 60);
		long hours = (int) ((millis / (1000 * 60 * 60)) % 24);
		return hours + ":" + minutes + ":" + seconds;
	}
	//Pozivamo metodu
	public static void main(String[] args) {
		System.out.println(convertMillis(100000));

	}

}

