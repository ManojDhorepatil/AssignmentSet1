package set47;

/*13.Retrieve the Palindrome-true number set from given number limit and return the sum
input1:90 input2:120
logic:99+101+111
output:311
*/
public class Palindrome_13 {

	public static void main(String[] args) {

		int n;
		int a, rev = 0;
		int no_1 = 90, no_2 = 120;
		int total = 0;

		System.out.print("Palindrome numbers are : ");
		for (int i = no_1; i <= no_2; i++) {
			n = i;
			while (n > 0) {
				a = n % 10;
				rev = rev * 10 + a;
				n = n / 10;
			}
			if (rev == i) {
				System.out.print(i + " ");
				total = total + i;

			}
			rev = 0;
		}
		System.out.println("");
		System.out.println("The total of palindrome numbers from " + no_1 + " to " + no_2 + " is " + total);
	}

}
