package set47;

import java.util.Arrays;

/*21.Find the extension of a given string file.
input: "hello.jpeg"
output: "jpeg"
*/
public class Extention_21 {
	public static void main(String[] args) {
		
		String str="hello.jpeg";
		
		/*String[] ans=str.split("\\.");
		System.out.println("The Extention of "+str+" file is "+ans[1]);
		*/
		//2nd method
		int location = 0 ;
		for(int i=0;i<str.length();i++)
		{
			char c = '.';
			
			if(c == str.charAt(i))
			{
				location = i ;
			}
		}
		
		System.out.println(str.substring(location+1, str.length()));
		
	}
}
