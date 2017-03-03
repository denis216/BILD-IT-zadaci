package zadaci_02_03_17;

public class RegularPolygonTest {

	public static void main(String[] args) {
		//Pravimo 3 obj
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Perimeter for regular poligon1 is: " + rp1.getPerimeters() 
		+ " and area is: " + rp1.getArea());
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Perimeter for regular poligon2 is: " + rp2.getPerimeters()
		+ " and area is: " + rp2.getArea());
		System.out.println("------------------------------------------------------------------------");

		System.out.println("Perimeter for regular poligon3 is: " + rp3.getPerimeters() 
		+ " and area is: " + rp3.getArea());
		System.out.println("------------------------------------------------------------------------");

	}
}

