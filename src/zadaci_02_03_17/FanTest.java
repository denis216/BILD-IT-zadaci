package zadaci_02_03_17;

public class FanTest {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		//Prvi objekat
		fan1.setOn(true);
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		System.out.println(fan1.toString());
		
		//Drugi objekat
		fan2.setOn(false);
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("Blue");
		System.out.println("--------------------------------------------------------");
		System.out.println(fan2.toString());
	}

}
