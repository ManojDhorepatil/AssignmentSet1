package set47;

import java.util.Scanner;

public class fiboancciSeries_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = 0, n2 = 1, n3, sum, upto;
		System.out.println("Enter input to print series upto = ");
		upto = s.nextInt();

		if (upto > 1) {
			System.out.print("fiboancci Series is-" + n1 + " " + n2 + "");
			sum = n1 + n2;
		} else {
			sum = 0;
		}
		for (int i = 2; i < upto; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3 + "");
			sum = sum + n3;
			n2 = n3;
			n1 = n2;
		}
		System.out.println(" ");

		System.out.println("Total Sum of Fibboncci Series upto " + upto + " is =" + sum);
	}

}
