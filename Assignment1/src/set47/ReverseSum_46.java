package set47;

import java.util.Scanner;

/*46. Retrieve the elements in a array, which is an input, which are greater than a specific input number.
Add them and find the reverse of the sum.*/

public class ReverseSum_46 {

	public static void main(String[] args) {
		
		int[] array = {11,25,45,32,58,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an input ");
		int input=sc.nextInt();
		int sum=0;
		int reverse=0;
		
		for(int  i=0;i<array.length;i++)
		{
			if(array[i]>input)
			{
				sum=sum+array[i];
			}
		}
		
		System.out.println("Addition of greater numbers then input is "+sum);
		
		while(sum != 0)
		{
			reverse= reverse*10;
			reverse= reverse+ sum%10;
			sum=sum/10;
		}
		
		System.out.println("The Reverse of sum is "+reverse);
		
	}
}
