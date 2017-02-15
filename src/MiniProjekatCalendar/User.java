package MiniProjekatCalendar;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class User {

	String userName = "root";
	String password = "Elena2712";
	String url = "jdbc:mysql://localhost:3306/calendar";
	
	//Metoda dodaje ime i sifru u bazu
	public void add(String ime, String sifra) {
		try (java.sql.Connection conn = DriverManager.getConnection(url, userName, password);) {
			PreparedStatement st = conn.prepareStatement("insert into calendar (ime,sifra) values (?,?)");
			st.setString(1, ime);
			st.setString(2, sifra);
			st.execute();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//Metoda provjerava ime, sifra ako postoji tj ako se poklapa vraca true
	public boolean isValid(String ime, String sifra) {
		try (java.sql.Connection conn = DriverManager.getConnection(url, userName, password);) {
			Statement st = conn.createStatement();

			st.executeQuery("Select * from calendar");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getString("ime").equals(ime) && rs.getString("sifra").equals(sifra)) {
					return true;
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	//Metoda koja ispisuje note ako je unesena sifra i ime tacni, ispisuje podsjetnik
	public void showNote(String ime, String sifra) {
		try (java.sql.Connection conn = DriverManager.getConnection(url, userName, password);) {
			Statement st = conn.createStatement();

			st.executeQuery("Select * from calendar");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getString("ime").equals(ime) && rs.getString("sifra").equals(sifra)) {
					System.out.println("Vasi podsjetnici su : " + rs.getString("note"));
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//Metoda dodaje novi note 
	public void addNewNote(String ime, String sifra, String newNote, String datumPodsjetnika) {
		try (java.sql.Connection conn = DriverManager.getConnection(url, userName, password);) {
			int id = 0;
			Statement st = conn.createStatement();
			st.executeQuery("Select * from calendar");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getString("ime").equals(ime) && rs.getString("sifra").equals(sifra)) {
					id = rs.getInt("id");

				}
			}
			st.execute(
					"update calendar set note='" + newNote + "', date_time='" + datumPodsjetnika + "'  where id=" + id);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//Metoda pokazuje note za izabrani dan
	public void showIzabranDan(String log, String pass, String datumPodsjetnika2) {
		try (java.sql.Connection conn = DriverManager.getConnection(url, userName, password);) {
			Statement st = conn.createStatement();

			st.executeQuery("Select * from calendar");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getString("ime").equals(log)) {

					if (rs.getString("date_time").equals(datumPodsjetnika2));
					System.out.println(rs.getString("date_time") + " Vas reminder je: " + rs.getString("note"));
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
