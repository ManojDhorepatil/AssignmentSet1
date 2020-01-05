package set47;

import java.util.Arrays;
import java.util.Scanner;

/*36.find the three consecutive characters in a string. if the string consists any three 
consecutive characters return 1 else return -1
like AAAxyzaaa will return true.*/

public class ConsecutiveChars_36 {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		System.out.println(isConsecutiiveOfChars(str));
	}

	public static int isConsecutiiveOfChars(String str) {

		int c = 0;
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) 
		{
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				count = 0;
			}

			if (count == 2)
				c++;

		}

		if (c > 0)
			return 1;
		else
			return -1;
	}
}
