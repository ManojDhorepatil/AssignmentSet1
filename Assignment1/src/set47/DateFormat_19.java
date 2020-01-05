package set47;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*19.accept a string and find if it is of date format "dd/MM/yyyy".
input:01/13/2012
output:false
*/
public class DateFormat_19 {
	public static void main(String[] args) {

		Scanner se = new Scanner(System.in);
		System.out.println("Enter date format dd/MM/yyyy = ");
		String D = se.next();

		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
		sdfrmt.setLenient(false);
		try {
			Date format = sdfrmt.parse(D);					// convert into date
			System.out.println(" is valid date format");	

		} catch (ParseException e) {
			System.out.println(" is Invalid Date format");

		}
	}
}
