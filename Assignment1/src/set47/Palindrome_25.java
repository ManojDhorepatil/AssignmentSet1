package set47;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*25. Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)
*/
public class Palindrome_25 {
	public static void main(String[] args) {
		
		System.out.println("Enter a string to check Palindrome");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String rev="";
		
		LinkedHashSet<Character> vowels =new LinkedHashSet<>();
		
		int lenght=str.length();
		
		for(int i=lenght-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is "+rev);
		
		if(str.equals(rev)) {			
			System.out.println(str+" is palindrome");
			str=str.toLowerCase();
			for(int i = 0; i < lenght ; ++i)
	        {
	            char ch = str.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u')
	            {
	                vowels.add(ch);
	            }
	        }
			System.out.println(" Vowels in String = "+vowels.size());
			
			if(vowels.size() >=2)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
		else {
			System.out.println(str+" is not palindrome");
		}
		
	}

}
