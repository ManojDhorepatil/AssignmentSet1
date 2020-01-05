package set47;

/*43. Retrieve the odd-position digits from input integer array. 
Multiply them with their index and return their sum.*/

public class OddPosition_43 {
	public static void main(String[] args) {
		
		int input[]= {5,1,6,2,9,4,3,7,8};
		int multiplication=1;
		int sum=0;
		
		for(int i=1;i<input.length;i=i+2)
		{
			multiplication=input[i]*i;
			sum=sum+multiplication;
		}
		
		//System.out.println("Multipication = " +multiplication);
		System.out.println("Addition = "+sum);
	}
}
