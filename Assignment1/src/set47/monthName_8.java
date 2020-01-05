package set47;

import java.util.Calendar;
import java.util.Date;

/*
 8. Given date in dd-MM-yyyy format.return the month in full name format(January)
input:"23-01-2012"
output:January
 */

public class monthName_8 {
	public static void main(String[] args) {

		String date = "23-05-2012";
		String day = date.substring(0, 2);
		int inputday = Integer.parseInt(day);

		String month = date.substring(3, 5);
		int inputMonth = Integer.parseInt(month);

		String year = date.substring(6, 10);
		int inputYear = Integer.parseInt(year);

		System.out.println(inputMonth);
		/*
		 * Calendar cal= Calendar.getInstance(); cal.set(Calendar.MONTH,inputMonth);
		 */

		switch (inputMonth) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febuary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Augest");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Octomber");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Give correct month input");
		}

	}
}
