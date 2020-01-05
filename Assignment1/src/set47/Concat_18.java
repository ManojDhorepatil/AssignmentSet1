package set47;

import java.util.Scanner;

/*18.Two input strings are accepted. If the two strings are of same length concat them and return, 
 if they are not of same length, reduce the longer string to size of smaller one, and concat them
input1:"hello"
input2:"hi" 
output:"lohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb"
*/
public class Concat_18 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Strings =");
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		String new_string;
		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 == len2) {
			new_string = str1 + str2;
			System.out.println("New string after concat = " + new_string);
		} else {
			int len;
			String str;

			if (len1 < len2) {
				len = len2 - len1;
				str = str2.substring(len, len2);
				new_string = str1 + str;
				System.out.println("New string after concat = " + new_string);
			} else {
				len = len1 - len2;
				str = str1.substring(len, len1);
				new_string = str + str2;
				System.out.println("New string after concat = " + new_string);
			}

		}
	}
}
