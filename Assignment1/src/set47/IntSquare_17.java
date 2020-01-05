package set47;

/*17. A integer input is accepted. find the square of individual digits and find their sum.
input:125
output:1*1+2*2+5*5

*/
public class IntSquare_17 {
	public static void main(String[] args) {

		int number = 125;
		int sum = 0, no;
		int sq, total = 0;
		
		while (number > 0) {
			no = number % 10;
			number = number / 10;
			sq = no * no;
			System.out.print(sq + "+");
			total = total + sq;
		}
		
		System.out.println("");
		System.out.println("Total addition =" + total);
	}
}
