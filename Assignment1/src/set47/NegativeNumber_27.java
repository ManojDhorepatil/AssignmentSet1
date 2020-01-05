package set47;

import java.util.Scanner;

/*27. Get a input string. Find if it is a negative number, 
 if true return the absolute value, in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1*/
public class NegativeNumber_27 {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a string to findout if it is Negative number or Not");
		String number=s.nextLine();
		int a,b;
		
		if(number.charAt(0)=='-')		
		{
			a=Integer.parseInt(number);
			b=Math.abs(a);
			System.out.println("Absolute value of "+a+" is " +b);
		}
		else
		{
			System.out.println(" -1 ");
		}
		
	}
}
