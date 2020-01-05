package set47;

import java.util.Arrays;

/*22.Get two integer arrays as input. Find if there are common elements in the arrays. 
 find the number of common elements.
input1: {1,2,3,4}
input2: {3,4,5,6}
output: 4(3,4,3,4)
*/
public class CommonElements_22 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 3, 4, 5, 6 };
		int c[] = new int[a.length + b.length];

		int location = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					// System.out.print(a[i]);
					c[location] = a[i];
					location++;
				}
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					// System.out.print(b[i]);
					c[location] = b[i];
					location++;
				}
			}
		}

		System.out.println("No of common elements = " + location + " & They are ");
		for (int i = 0; i < location; i++) {
			System.out.print(" " + c[i]);
		}

	}
}
