package set47;

/*28.An arraylist of Strings is given as input. The count of the String elements that 
 are not of size input 2 string is to be returned.
input1: {"aaa","bb","cccc","d"}
input2: "bb"
output: 3("bb"-length:2)
*/
public class SizeInput_28 {
	public static void main(String[] args) {
		String str[]={"aaa","bbb","cc","dd"};
		String a="bb";
		
		int count=0;
		for(int i=0;i<str.length;i++) 
		{
			if(a.length()!=str[i].length())
			{
				count++;
				
			}
		}
		System.out.println("The count of the String elements is "+count);
		
	}
}
