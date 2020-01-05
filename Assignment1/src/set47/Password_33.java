package set47;

import java.util.Scanner;

/*
33.Validate a password 
i) there should be atleast one digit
ii) there should be atleast one of '#','@' or '$' .
iii)the password should be of 6 to 20 characters
iv) there should be more uppercase letter than lower case.						
v) should start with an upper case and end with lower case.
*/
public class Password_33 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter password string =");
		String password = s.next();

		int count = 0;

// length
		if (password.length() >= 6 && password.length() <= 20) {
			count++;
		}
//digit	
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				count++;
				break;
			}
		}
//special symbol	
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$') {
				count++;
				break;
			}
		}
//uppercase and lowercase		
		char startChar = password.charAt(0);
		char endChar = password.charAt(password.length() - 1);
		if ((startChar >= 'A' && startChar <= 'Z') && (endChar > 'a' && endChar <= 'z')) {
			count++;
		}

//count no of upper and lower case
		int lowercase = 0, uppercase = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				lowercase++;
			} else {
				uppercase++;
			}
		}
//check  no of upper and lower case 		
		if (uppercase > lowercase) {
			count++;
		}

//final
		if (count == 5) {
			System.out.println("Valid Password");
		} else {
			System.out.println("In-valid Password");
		}

	}

}
