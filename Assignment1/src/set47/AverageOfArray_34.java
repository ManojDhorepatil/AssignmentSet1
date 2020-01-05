package set47;

import java.util.Scanner;

/*34. find the average of the maximum and minimum number in an integer array*/
public class AverageOfArray_34 {
	public static void main(String[] args) {
		//int array[]= {12,36,45,10,25};
		
		int array[]= new int[5];
		System.out.println("Enter Array elements = ");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		
		double max=array[0];
		double min=array[0];
		for(int i=1;i<array.length;i++) 
		{
			if( array[i] > max ) 
				{
					max=array[i];
				}
			if(array[i] < min)
				{
					min=array[i];
				}
		}
		
		System.out.println("Minimum number = "+min);
		System.out.println("Maximum number = "+max);
		
		double average=(min+max)/2;
		System.out.println("Average of Minimum & Maximum number is "+average);
	}
}
