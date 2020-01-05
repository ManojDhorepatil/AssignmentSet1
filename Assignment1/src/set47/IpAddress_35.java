package set47;

import org.apache.commons.validator.routines.InetAddressValidator;
import java.util.Arrays;
import java.util.Scanner;

/*35.validate the ip address in the form a.b.c.d
where a,b,c,d must be between 0and 255
if validated return 1 else return 2*/

public class IpAddress_35 {
	
	public static void main(String[] args) {
		System.out.println("Enter an IP Address in form of a.b.c.d = ");
		Scanner s= new Scanner(System.in);
		final String IpAddress= s.nextLine();  // "172.45.26.3";
	
		InetAddressValidator validator=InetAddressValidator.getInstance();
		
		if (validator.isValidInet4Address(IpAddress)) {
			System.out.print("The IP address " + IpAddress + " is valid");
			System.out.println(" so it Returns = 1");
		}
		else {
			System.out.print("The IP address " + IpAddress + " isn't valid");
			System.out.println(" so it Returns = 2");
		}
		
		/*if(isValidIpAddress(IpAddress)) 
		{
			System.out.println(IpAddress+" is Valid IP Address");
		}
		else {
			System.out.println(IpAddress+" is not Valid IP Address");
		}*/
	}
	
	/*public static boolean isValidIpAddress(String ip) 
	{
		String[] groups	=ip.split("\\.");
		
		if(groups.length != 4) {
			System.out.println(" if false ");
			return false;
		}
		
		try {
			System.out.println("try block");
			return Arrays.stream(groups).filter(s -> s.length() > 1 && s.startsWith("0"))
					.map(Integer::parseInt)
					.filter(i -> (i >= 0 && i <= 255))
					.count() == 4;
		
		}
		catch(Throwable t) {
			System.out.println("false catch");
			return false;
		}
		
	}*/
 }
