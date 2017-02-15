package MiniProjekatCalendar;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	//OVO SAM SAMO TESTIRAO BAZU
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName = "root";
		String password = "Elena2712";
		String url = "jdbc:mysql://localhost:3306/calendar";
		try (java.sql.Connection conn = DriverManager.getConnection(url, userName, password);) {
			PreparedStatement st = conn.prepareStatement("insert into calendar (ime,sifra,note) values (?,?,?)");
			System.out.println("Unesite ime:");
			String ime = input.nextLine();
			System.out.println("Unesite sifru:");
			String sifra = input.nextLine();
			System.out.println("Unesite note:");
			String note = input.nextLine();
			st.setString(1, ime);
			st.setString(2, sifra);
			st.setString(3, note);
			st.execute();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
