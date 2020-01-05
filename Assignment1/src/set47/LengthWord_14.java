package set47;

import java.util.Arrays;

/*14.find the max length-word in a given string and return the max-length word.
 if two words are of same length return the first occuring word of max-length
input:"hello how are you aaaaa"
output:hello(length-5)
*/
public class LengthWord_14 {
	public static void main(String[] args) {
		
		String input ="helloo how areoo youoo aaaaa";
		String abc[] =input.split(" ");
		System.out.println(Arrays.toString(abc));
		
		String ans="";
		
		for(int i=0;i<abc.length-1;i++) {
			
			if(abc[i].length() > abc[i+1].length())
			{
				
				if(ans.length() < abc[i].length())
				{
					ans=abc[i];
					System.out.println(ans);
				}
				
			}
		}
		
	}
}
