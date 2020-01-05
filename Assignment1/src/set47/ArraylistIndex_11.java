package set47;

import java.util.Arrays;
import java.util.Comparator;

/*
 11.Two inputs of a string array and a string is received.The array should be sorted in descending order. 
 The index of second input in a array should be retrieved.
input1:{"ga","yb","awe"}
input2:awe
output:2
 */
public class ArraylistIndex_11 {
	public static void main(String[] args) {
		String a[] = { "ga", "yb", "awe" };
		String b = "mano";

		Arrays.sort(a, Comparator.reverseOrder());
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				System.out.println("The location of string " + b + " is at " + i + "");
				break;
			} else if (i == a.length - 1) {
				System.out.println("String does not found in array");
			}
		}

	}

}
