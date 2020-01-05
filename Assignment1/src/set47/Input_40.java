package set47;

/*40.input1="Rajasthan";
input2=2;
input3=5;
output=hts; */

public class Input_40 {
	public static void main(String[] args) {
		String input1="Rajasthan";
		int input2=2;
		int input3=5;
		int start=input1.length()-input2;
		int end=input1.length()-input3;
		
		//System.out.println(start+"  "+end);
		
		for(int j=start-1; j>end-1; j--)
		{
			System.out.print(input1.charAt(j));
		}
		
	}
}
