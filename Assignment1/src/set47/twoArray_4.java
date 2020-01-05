package set47;

import java.util.Arrays;
import java.util.Scanner;

/*
4.Given two integer arrays. merge the common elements into a new array. find the sum of the elements
input1:{1,2,3,4}
input2:{3,4,5,6}
logic:{3,4}
output:7
*/
public class twoArray_4 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4,6,6 };
		int b[] = { 3, 4, 5, 6 };
		
		/*int length;
		Scanner s =new Scanner(System.in);
		length=s.nextInt();
		
		int []a= new int[length];
		int []b= new int[length];
		
		for(int i=0;i<length;i++)
			a[i]=s.nextInt();
		
		for(int i=0;i<length;i++)
			b[i]=s.nextInt();		
			*/
			
		int c[] = new int[a.length];
		int addition = 0;
		int location = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[location] = a[i];
					location++;
				}
			}
		}

		System.out.println("New Merge Array c = {");

		for (int i = 0; i < location; i++) {
			System.out.print(" " + c[i]);
			addition = addition + c[i];
		}
		System.out.println("}");
		System.out.println("Total sum of merge array =" + addition);

	}

}
