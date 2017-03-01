package Hackathon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailZadatak5NaDrugiNacin {

	public static void main(String[] args) throws IOException {
		Pattern pattern = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}");
        File file = new File("test.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        int lines = 0;
        int matches = 0;
        for (String line = in.readLine();
        		line != null; 
        		line = in.readLine()) {
            lines++;
            Matcher matcher = pattern.matcher(line.toUpperCase());
            if (matcher.matches()) {    
                System.out.println(lines + ": '" + line + "'");
                matches++;
            }
        }
        if (matches == 0) {    
            System.out.println("Ni jedan od emalova nije validan");
        } else {
            System.out.println("\n" + matches + " Emaila su validna ");
        }
    }
}  