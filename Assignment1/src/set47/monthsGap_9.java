package set47;
/*
 9. Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
input1:"2012-12-01"
input2:"2012-01-03"
output:11
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class monthsGap_9 {
	
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("Enter first date format=yyyy-mm-dd=");
		String n = se.next();
		System.out.println("Enter second date format=yyyy-mm-dd=");
		String j = se.next();
		
		Period diff = Period.between(LocalDate.parse(n), LocalDate.parse(j));

		System.out.println(diff);
	}
	
}
