package set47;

import java.util.Scanner;

/*31.Enter your name and return a string "print the title first and then comma and 
 then first letter of initial name.*/
public class NameTitle_31 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")			//for scanner warning
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Name ");
		String name=s.nextLine();
		name=name.toUpperCase();
		
		//System.out.println();
		System.out.print("Mr. ");
		char firstLetter =name.charAt(0); 
		System.out.print(""+firstLetter);
		
	}
}
