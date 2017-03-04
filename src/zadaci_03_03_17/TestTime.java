package zadaci_03_03_17;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TestTime {

	public static void main(String[] args) {
		// Create 2 time objects
		Time time = new Time(555550000);
		Time time1 = new Time();

		// display objects hour, minute and second
		System.out.println(time.getHour() + "h " + time.getMinute() + "min " + time.getSecond() + "sec");
		System.out.println(time1.getHour() + "h " + time1.getMinute() + "min " + time1.getSecond() + "sec");

		// Ako zelimo vrijeme za nasu vremensku zonu koristimo ovo
		// java.util.Date date = new java.util.Date();
		// System.out.println(date.toString());
	}

}
