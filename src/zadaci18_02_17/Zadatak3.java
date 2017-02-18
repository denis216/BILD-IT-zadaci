package zadaci18_02_17;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak3 {

	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();
		displayTime(gc);
	}

	// Method koja izracunava tacno vrijeme datum, sat, minutu, sekundu i
	// ispisuje korisniku
	public static void displayTime(GregorianCalendar gc) {

		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH);
		int day = gc.get(Calendar.DAY_OF_MONTH);
		int hour = gc.get(Calendar.HOUR);
		int minute = gc.get(Calendar.MINUTE);
		int second = gc.get(Calendar.SECOND);

		System.out.print("Trenutni datum i vrijeme je: ");
		System.out.print(day + "." + (month + 1) + "." + year + " ");
		System.out.println(hour + ":" + minute + ":" + second);
	}
}