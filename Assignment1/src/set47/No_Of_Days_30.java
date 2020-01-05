package set47;

/*30. Find the number of days between two input dates. */

public class No_Of_Days_30 {
	
	static int day1,
				month1,
				 year1;
	static int day2,
				month2,
				 year2;
	static Boolean increment=true;
	static int jumpMonthBy;
	static int jumpYearBy;
	static int jumpDaysBy;
	
	public static void date1_set(String date1)
	{
		String day=date1.substring(0, 2);
		 day1=Integer.parseInt(day);
		String month=date1.substring(3,5);
		 month1=Integer.parseInt(month);
		String year=date1.substring(6,10);
		 year1=Integer.parseInt(year);
		
	}
	
	public static void date2_set(String date2) 
	{
		String day=date2.substring(0, 2);
		 day2=Integer.parseInt(day);
		String month=date2.substring(3,5);
		 month2=Integer.parseInt(month);
		String year=date2.substring(6,10);
		 year2=Integer.parseInt(year);
	}
	
	public static void main(String[] args) {
	
		String date1="12/04/2019";
		String date2="25/02/2020";
		
		int years,months,totalDays=0;
	
		date1_set(date1);
		date2_set(date2);
		
		differenceInYears();
		System.out.println("Years jump By " + jumpYearBy );
		System.out.println(increment);
		if(increment == true || increment == false) {
			years=jumpYearBy*365;
			totalDays=totalDays+years;
		}
		
		differenceInMonths();
		System.out.println("Months jump by " + jumpMonthBy);
		System.out.println(increment);
		if(increment == true) {
			months=jumpMonthBy*30;
			totalDays=totalDays+months;
		}
		else {
			months=jumpMonthBy*30;
			totalDays=totalDays-months;
		}
		
		
		differenceInDays();
		System.out.println("Days jump By " + jumpDaysBy );
		System.out.println(increment);
		if(increment == true) {
			totalDays=totalDays+jumpDaysBy;
		}
		else {
			totalDays=totalDays-jumpDaysBy;
		}
		
		System.out.println("Total days between "+date1+" & "+date2+" is " +Math.abs(totalDays));
		
	}
	
	public static void differenceInYears() 
	{
		if(year2>year1)
		{
			jumpYearBy=year2-year1;
			
		}
		else
		{
			jumpYearBy=year1-year2;
			increment=false;
		}
	}

	public static void differenceInMonths() 
	{
		if(month2>month1)
		{
			jumpMonthBy=month2-month1;
			increment=true;
			
		}
		else
		{
			jumpMonthBy=month1-month2;
			increment=false;
		}
	}
	
	public static void differenceInDays() 
	{
		if(day2>day1)
		{
			jumpDaysBy=day2-day1;
			increment=true;
		}
		else
		{
			jumpDaysBy=day1-day2;
			increment=false;
		}
	}

}
