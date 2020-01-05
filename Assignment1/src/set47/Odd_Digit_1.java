package set47;

/*1. A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1*/

import java.util.Scanner;

public class Odd_Digit_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to findout Odd digits = ");
		int number = s.nextInt();
		int odddigit = 0, sum = 0;
		System.out.println("Number is = " + number);
		while (number > 0) {
			odddigit = number % 10;

			for (int i = 1; i < 10; i = i + 2) {
				if (odddigit == i) {
					sum = sum + odddigit;
				}

			}

			number = number / 10;

		}

		System.out.println("Sum is = " + sum);

		// if the number is perfectly divisible by 2 to check even or odd
		if (sum % 2 == 0)
			System.out.println("sum is Even so return -1");
		else
			System.out.println("sum is odd so return  1");

	}

}
