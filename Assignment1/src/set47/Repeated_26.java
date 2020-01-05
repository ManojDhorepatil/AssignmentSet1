package set47;

/*26. Find no of characters in a given string which are not repeated.
input: "hello"
output: 3
*/
public class Repeated_26 {
	public static void main(String[] args) {
		
		String str ="hello";
		int length=str.length();		
		int ans=0;
		
		for(int i=0;i<length;i++)
		{
			int count=0;
			for(int j=0;j<length;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			
			if(count==1)
			{
				ans++;
			}
		}
		
		System.out.println("No of characters in "+str+" string which are not repeated are " +ans);
	}
}
