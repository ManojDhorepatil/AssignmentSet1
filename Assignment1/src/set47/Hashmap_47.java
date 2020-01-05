package set47;

import java.util.HashMap;
import java.util.Map;

/*
 47.Input a hashmap. Count the keys which are not divisible by 4 and return.
*/
//hashmap using key and value
public class Hashmap_47 {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
		hm.put(2, 10d); 			//put value key and value
		hm.put(1, 10d); 			//key should be unique
		hm.put(7, 10d);				 //value duplicate allowed
		int count = 0; 
		
		for (Map.Entry<Integer, Double> me : hm.entrySet()) // entryset using iterator value
		{
			int no = me.getKey(); 	// get key value only
			if (no % 4 != 0)		 //logic divide by 4 dont get key
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
