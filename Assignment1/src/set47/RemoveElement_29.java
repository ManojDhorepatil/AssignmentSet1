package set47;

import java.util.Arrays;
import java.util.Scanner;

/*29.An array of integers is given.The given element is removed new array is returned.
input1:{10,10,20,30,76}
output: {20,20,76}(10 is asked to remove)*/

public class RemoveElement_29 {
	public static void main(String[] args) {
		//int array1[]={10,10,20,30,76};
		
		int array1[]= new int[5];
		System.out.println("Enter Array elements = ");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter element to be removed ");
		int no=sc.nextInt();
		
		int array2[]= new int[array1.length-1];
		int loc=0;
		
		for(int i=0;i<array1.length;i++)
		{
			if(no!=array1[i])
			{
				array2[loc]=array1[i];
				loc++;
				
			}
		}
		System.out.println();
		
		for(int i=0;i<loc;i++)
		{	
		System.out.print(" "+array2[i]);
		}
		
		
		
	}
}
