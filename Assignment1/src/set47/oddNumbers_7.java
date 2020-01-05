package set47;

import java.util.Scanner;

/*
 7. Retrieve the odd numbers till given input number. add and subtract it consecutively 
 and return the result.
Input:9
Output:1+3-5+7-9=-3
*/

public class oddNumbers_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number to retrive odd numbers =");
		int number = s.nextInt();
		int location = 0;
		int total = 1;
		for (int i = 3; i <= number; i = i + 2) {
			if (location % 2 == 0) {
				total = total + i;
				location++;

			} else {
				total = total - i;
				location++;
			}

		}

		System.out.println("Total = " + total);

	}

}
