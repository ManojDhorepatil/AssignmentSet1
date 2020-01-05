package set47;

import java.util.Arrays;

/*23.Find if a given pattern appears in both the input strings at same postions.
input1: "hh--ww--"
input2: "rt--er--"
output: true(false otherwise)
*/

public class Pattern_23 {
	public static void main(String[] args) {
		String str1="hh--ww--";
		String str2="rt--er--";
		int s1[]=new int[str1.length()];
		int s2[]=new int[str2.length()];
		int index1=0;
		int index2=0;
		
		char c='-';
		for(int i=0;i<str1.length();i++) 
		{
			if(c==str1.charAt(i)) {
				s1[index1]=str1.charAt(i);
				index1++;
			}
		}
		System.out.println(" "+Arrays.toString(s1));
		for(int i=0;i<str2.length();i++) 
		{
			if(c==str2.charAt(i)) {
				s2[index2]=str2.charAt(i);
				index2++;
			}
		}
		System.out.println(" "+Arrays.toString(s2));
		int count=0;
		for(int i=0;i<index1;i++)
		{
			if(s1[i]==s2[i] )
			{
				count++;
			}
		}
		
		if(index1==count) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	}
}
