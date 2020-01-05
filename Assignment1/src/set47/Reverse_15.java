package set47;

import java.util.Scanner;


/*15. Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c
*/
public class Reverse_15 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter input string");
		 String str=s.nextLine();
		// System.out.println(str);
		 
		 String ans="";
			
			for (int i=str.length()-1;i>=0;i-- ) {
				char c=str.charAt(i);
				ans=ans+c+"-";
				
			}
		System.out.println(ans.substring(0,ans.length()-1));
			//System.out.println(ans);
		 
		 
	}

}
