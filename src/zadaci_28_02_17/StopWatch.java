package zadaci_28_02_17;

public class StopWatch {

	private long startTime;
	private long endTime;
	
	//Konstruktor
	public StopWatch() {
		this.startTime = startTime;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public long getElapsedTime(){
		return endTime - startTime;
	}
	

}


	


