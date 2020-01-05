package set47;

import java.time.YearMonth;

/*44. Return the number of days in a month, where month and year are given as input.*/

public class NumberOfDays_44 {
	
	static int month=0,
				year=0,
				days=0;
	public static void main(String[] args) {
		String date="02/2020"; 
		
		findDays(date);
		
		System.out.println("Month is " +month);
		System.out.println("Year is "+year);
		System.out.println("Number of Days in "+month+"th month is "+days);
	}

	public static void findDays(String date) 
	{
		String month1=date.substring(0,2);
		 month=Integer.parseInt(month1);
		String year1=date.substring(3,7);
		 year=Integer.parseInt(year1);
		 
		 YearMonth ym =YearMonth.of(year,month);
		 days=ym.lengthOfMonth();
	}
}
