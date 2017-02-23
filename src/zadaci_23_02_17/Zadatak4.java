package zadaci_23_02_17;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak4 {

	public static void main(String[] args) {
		printDateAndTime();
	}
	// Method koja ispisuje datum i tacno vrijeme
	public static void printDateAndTime() {
		
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH);
		int day = gc.get(Calendar.DAY_OF_MONTH);
		int hour = gc.get(Calendar.HOUR);
		int minute = gc.get(Calendar.MINUTE);
		int second = gc.get(Calendar.SECOND);
		
		System.out.println("Datum: " + day + "." + (month + 1) + "." + year);
		System.out.println("Tacno vrijeme: " + hour + ":" + minute + ":" + second);
	}
	
}
/*Poceo sam i na ovaj nacin raditi ali ne znam dali ces privatiti rijesenje :D
	//public static void printDateAndTime() {
	//	System.out.println("Datum: " + LocalDate.now());
	//	System.out.println("Datum: " + LocalTime.now());
	}*/


	
	
