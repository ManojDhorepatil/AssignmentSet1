package set47;

import java.util.Scanner;

/*3.A integer array is given as input. find the difference between each element. Return the index of the largest element which has the largest difference gap.
input: {2,3,4,2,3}
logic: 2-3=1,3-4=1,4-2=2,2-3=1
2 is the max diff between 4 and 2,return the index of 4 i.e 2
output:2*/

public class array_3 {
	public static void main(String[] args) {

		//int a[] = { 2, 3, 4, 2, 3 };
		int a[]= new int[5];
		System.out.println("enter Array elements = ");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int dif = 0, position = 0;
		int result = 0;
		for (int i = 0; i < a.length - 1; i++) {

			dif =Math.abs( a[i] - a[i + 1]);

			if (dif > result) {
				result = dif;
				position = i;
			}
		}

		System.out.println("The difference bet large elements are " + result);
		System.out.println("The index of the largest element which has the largest difference gap is " + position);
	}

}
