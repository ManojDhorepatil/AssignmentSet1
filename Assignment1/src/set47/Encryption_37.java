package set47;

import java.util.Scanner;

/*37.String encryption. replace the odd-index character with next character
 (if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
	leave the even index as such. return the encrypted string.*/
public class Encryption_37 {
	public static void main(String[] args) {
		
		System.out.println("Enter the string for Encryption ");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int k=1;
		EncryptingData(str,k);
		
	}

	public static void EncryptingData(String str, int k) 
	{	
		 String EncyptedStr = ""; 
		   
	        for (int i = 0; i < str.length(); ++i)
	        {     
	        	if(i%2!=0)
	        	{
	        		int value = str.charAt(i); 		// ASCII value 
		            //System.out.println("val="+value);
	        		int dup = k; 
		
		            if (value + k > 122) 				// if k-th character exceed 'z'  
		            { 
		                k =k-(122 - value); 
		                k = k % 26; 
		                  
		                EncyptedStr =EncyptedStr +(char)(96 + k); 
		            }
		            else 
		            { 
		            	EncyptedStr = EncyptedStr+ (char)(value + k); 
		            } 
		  
		            k = dup; 
	
	        	}
	        	else
	        	{
	        		
				EncyptedStr = EncyptedStr+str.charAt(i);
		
	        	}
	        }
	  
	        System.out.println("After Encryption of String is = " +EncyptedStr); 
		
	}
}
