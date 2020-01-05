package set47;

/*16. HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.			
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90
*/

import java.util.HashMap;
import java.util.Map;

public class Q16HashMap16 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		hmap.put(12, 90);
		hmap.put(35, 30);
		hmap.put(33, 30);
		hmap.put(56, 30);

		int sum = 0;
		int cont = 0;
		for (Map.Entry<Integer, Integer> map : hmap.entrySet()) {
			int value = map.getValue();
			int key = map.getKey();
			if (key % 2 != 0) {
				sum = sum + value;
				cont++;
			}
			
		}
		int average = sum / cont;
		System.out.println(average);
		
	}

}
