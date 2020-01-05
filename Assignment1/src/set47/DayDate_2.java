package set47;

import java.util.Calendar;
import java.util.Scanner;

public class DayDate_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the month =");
		int month = s.nextInt();
		System.out.println("Enter the date of day =");
		int day = s.nextInt();
		System.out.println("Enter the year =");
		int year = s.nextInt();

		System.out.println("The Date is MM-DD-YYYY format = " + month + "-" + day + "-" + year);

		Calendar cal = Calendar.getInstance();
		// cal.set(cal.MONTH, month-1); //learn month problem
		// cal.set(cal.DATE, day);
		// cal.set(cal.YEAR, year);
		cal.set(year, month - 1, day);

		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		}
	}

}
