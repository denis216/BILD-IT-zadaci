package zadaci_02_03_17;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
		//Default konstruktor
	public Fan() {
		
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}
	@Override
	public String toString() {
		if (on == true) {
			return "Fan speed is: " + getSpeed() + " color is: " + getColor() + " and radius is: " + getRadius();
		} else {
			return "Fan is off " + "Color is: " + getColor() + " and radius is: " + getRadius();
		}
	}


}