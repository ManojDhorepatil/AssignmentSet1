package set47;

import java.util.Scanner;

/*Retrieve the non-prime numbers within the range of a given input. Add-up the non-prime numbers 
and return the result.*/

public class NonPrimeNos_45 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to retrive non prime numbers ");
		int limit=sc.nextInt();
		int m,result=0;

		for(int i=0;i<limit;i++)
		{
			if(i==0 || i==1)
			{
				System.out.print(" "+i);
				result=result+i;
			}
			else 
			{
				m=i/2;
				for(int j=2;j<=m;j++)
				{
					if(i%j==0) {
						System.out.print(" "+i);
						result=result+i;
						break;
					}
				}
			}
		}
		
		System.out.println();
		System.out.println(" The addition of Non Prime Numbers upto "+limit+" is "+result);
	}
}
