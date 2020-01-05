package set47;

import java.util.Scanner;

/*38.Retrieve the max from array which is in a odd-index. */
public class Max_38 {

	public static void main(String[] args) {
		// int array[]= {11,12,13,45,25,10};
		int array[] = new int[5];
		System.out.println("Enter Array elements = ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int max = 0;
		int location = 0;

		for (int i = 1; i < array.length; i = i + 2) {
			if (max < array[i]) {
				max = array[i];
				location = i;
			}

		}

		System.out.println("Maximum Number at " + location + " position from array is " + max);
	}
}
