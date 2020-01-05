package set47;

import java.util.Arrays;
import java.util.Scanner;

/*42. input1=commitment;
output=cmmitmnt;
c be the first index position 
remove even vowels from the string. */

public class RemveVowels_42 {
	public static void main(String[] args) {
		
		System.out.println("Enter new string ");
		Scanner s= new Scanner(System.in);
		String input=s.next();
		String str="";
		String r="";
		
		
		
		for(int i=0;i<input.length();i++)
		{
			if(i%2 != 0)
			{
				if(input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
					input.charAt(i)  == 'i' ||  input.charAt(i) == 'o' || input.charAt(i) == 'u')
				{
					//r+=str.charAt(i);
				}
				else
				{
					str=str+input.charAt(i);
				}

			}
			else
			{
				str=str+input.charAt(i);
			}
					
		}
		
		System.out.println(str);
		
		
	}
}
