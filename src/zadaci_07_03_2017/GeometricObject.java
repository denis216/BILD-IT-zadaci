package zadaci_07_03_2017;
import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;

	
	public GeometricObject() {
		dateCreated = new Date();
	}

	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	
	@Override
	public String toString() {
		return "Created on " + this.dateCreated + "\ncolor " + this.color + " and filled " + this.filled; 
	}

	/**
	 * Accessor method for color.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Mutator method for color.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Accessor method for filled.
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * Mutator method for filled.
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * Accessor method for date.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Mutator method for date.
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}