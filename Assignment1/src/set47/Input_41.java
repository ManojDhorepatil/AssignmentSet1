package set47;

import java.util.HashSet;
import java.util.Set;

public class Input_41 {
	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		//a.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4 }));
		Set<Integer> b = new HashSet<Integer>();
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(6);
		
		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set : ");
		System.out.println(union);

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set : ");
		System.out.println(intersection);

		// To find the MIn element of a set
		Set<Integer> minus = new HashSet<Integer>(a);
		minus.removeAll(intersection);
		System.out.print("A-B of the two Set : ");
		System.out.println(minus);

	}
}
