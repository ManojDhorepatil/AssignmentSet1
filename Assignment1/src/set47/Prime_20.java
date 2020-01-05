package set47;

/*20. Get a integer array as input. Find the average of the elements which are in the position of prime index
input:{1,2,3,4,5,6,7,8,9,10}
logic:3+4+6+8(the indeces are prime numbers)
output:21
*/
public class Prime_20 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int m = 0, flag = 0;
		int total = 0;
		System.out.println("The prime numbers idices value are ");

		for (int i = 2; i < a.length; i++) {
			m = i / 2;
			for (int j = 2; j <= m; j++) {
				if (i % j == 0) {
					flag = 1;
					// System.out.print(a[i]);
					break;
				}
			}
			if (flag == 0) {
				System.out.print(a[i]);
				total = total + a[i];
			}

			flag = 0;
		}
		System.out.println("");
		System.out.println("The total addition of idices value are " + total);
	}
}
