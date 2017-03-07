package zadaci_07_03_2017;
import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String color = "";
		boolean filled = false;
		double side1 = 0.0;
		double side2 = 0.0;
		double side3 = 0.0;
		while (true) {
			try {

				System.out.println("Enter thre sides for triangle:");
				side1 = input.nextDouble();
				side2 = input.nextDouble();
				side3 = input.nextDouble();

				while (side1 < -100 || side1 > 100 || side2 < -100 || side2 > 100 || side3 < -100 || side3 > 100) {
					System.out.println("Please enter number between -100 and 100 for side1, side2, side3: ");
					side1 = input.nextDouble();
					side2 = input.nextDouble();
					side3 = input.nextDouble();
				}

				System.out.println("Enter color: ");
				color = input.next();
				if (!isColorValid(color)) {
					while (true) {
						System.out.println("You did not enter the valid color. \nEnter color: ");
						color = input.next();
						if (isColorValid(color) == true) {
							break;
						}
					}
				}
				System.out.print("Enter boolean value that indicate whether the tringle is filled: ");
				filled = input.nextBoolean();
				Triangle tr1 = new Triangle(color, filled, side1, side2, side3);

				System.out.println("Area of triangle is: " + tr1.getArea());
				System.out.println("Perimeter of triangle is: " + tr1.getPerimeter());
				System.out.println("Color of triangle is: " + tr1.getColor());
				System.out.println("Is filled? " + tr1.isFilled());
				break;
			} catch (Exception e) {
				System.out.println("You didnt not provide adequate value. Please try again: ");
				input.nextLine();
			}

		}
	}

	public static boolean isColorValid(String color) {
		for (int i = 0; i < color.length(); i++)
			if (!Character.isLetter(color.charAt(i)))
				return false;
		return true;
	}
}
