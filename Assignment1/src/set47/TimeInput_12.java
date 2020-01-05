package set47;

import java.util.Scanner;
import java.util.regex.Pattern;

/*12.A time input is received as string. Find if the hour format is in 12 hour format.
  the suffix am/pm is case insensitive.
input:"09:36 am"
output:true
*/
public class TimeInput_12 {
public static boolean validateTime(String time) {
		
		//Displaying current time in 12 hour format with AM/PM
		
		//boolean status;
		String timePattern="(1[012]|[1-9]):[0-5][0-9](\\\\s)?(?i)(am|pm|AM|PM)";
		Pattern pat = Pattern.compile(timePattern); 
        if (time == null)
            return false; 
        
        return pat.matcher(time).matches(); 
        
    }

	 public static void main(String[] args)
	 {	
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Time in (hh:mmAM/PM) format =");
		String n = sc.nextLine();
		boolean result = validateTime(n);
	   System.out.println(result);
	    
	 } 
}