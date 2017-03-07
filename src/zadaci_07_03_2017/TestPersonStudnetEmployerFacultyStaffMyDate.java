package zadaci_07_03_2017;

public class TestPersonStudnetEmployerFacultyStaffMyDate {

	public static void main(String[] args) {
		// Creating objects
		Person person = new Person("Denis", "065-537-571", "Tamo daleko 14/7", "denis216@hotmail.com");

		Student student = new Student("Jovanka ", "U rupi ", "065-555-555 ", "jovanka@hotmail.com", 1);

		Employee employee = new Employee("Sipo", "Pijeskovi", "065-123-456", "sipo@gmail.com", 422, 30000);

		Faculty faculty = new Faculty("Nevena", "Paklenica bb", "066-333-333", "nevena@gmail.com", 111, 150000,
				"13:00 do 19:20", "Profesor");

		Staff staff = new Staff("Ensar", "Tesanj bb", "061-111-111", "enso@gmail.com", 4, 265000,
				"Executive Assistant");

		// Printing out information
		System.out.println(person.toString());
		System.out.println();
		System.out.println(student.toString());
		System.out.println();
		System.out.println(employee.toString());
		System.out.println();
		System.out.println(faculty.toString());
		System.out.println();
		System.out.println(staff.toString());

	}

}