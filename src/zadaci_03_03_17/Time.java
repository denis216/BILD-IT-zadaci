package zadaci_03_03_17;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		this(System.currentTimeMillis());

	}

	// Constructor with param. long miliseconds
	public Time(long milliseconds) {
		long seconds = milliseconds / 1000;
		second = (int) (seconds % 60);
		long minutes = seconds / 60;
		minute = (int) (minutes % 60);
		long hours = minutes / 60;
		hour = (int) (hours % 24);
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	// Method that sets time
	public void setTime(long milliseconds) {
		long seconds = milliseconds / 1000;
		second = (int) (seconds % 60);
		long minutes = seconds / 60;
		minute = (int) (minutes % 60);
		long hours = minutes / 60;
		hour = (int) (hours % 24);
	}

}
