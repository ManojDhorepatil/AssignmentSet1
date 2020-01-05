package set47;

/*
 5.Given two arraylists. retrieve the odd position elements form first input and even position elements from second list. 
put it into the new arraylist at the same positions from where they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3}
input2:{0,12,2,23}
output:{0,1,2,3}
*/

public class Arraylist_5 {

	public static void main(String[] args) {
		int a[]={12,1,32,3};
		int b[]={0,12,2,23};
		
		int c[]=new int[a.length];
		
		for(int i=1;i<a.length;i=i+2) {
			c[i]=a[i];
		}
		
		for(int i=0;i<b.length;i=i+2) {
			c[i]=b[i];
		}
			System.out.println("New Array =");
	
		for (int i = 0; i < c.length; i++) {
			System.out.print(" "+ c[i]);
		}
	}

}
