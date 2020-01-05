package set47;

/*24. Input a int array. Square the elements in even position and cube the elements in odd position and add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2
*/
public class SquareAndCube_24 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int total = 0;
		int square, cube;
		
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				
				// System.out.print(" "+i+" "+a[i]);
				
				square = Math.multiplyExact(a[i], a[i]);
				//System.out.print(" " + square);
				total = total + square;
				//System.out.println(" " + total);

			} else {
				// System.out.println(" "+i+" "+a[i]);
				cube = a[i] * a[i] * a[i];
				
				//System.out.print(" " + cube);
				total = total + cube;
				//System.out.println(" " + total);
			}
		}

		System.out.println("The total addition of square & cube of elements is " + total);
	}
}
