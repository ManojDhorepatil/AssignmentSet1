package set47;

/*39.GIVEN A STRING 555-666-1234								
DISPLAY AS 55-56-661-234?
*/
public class Display_39 {

	public static void main(String[] args) {
		
		String s = "555-666-1234";
		
		String n[] = s.split("-");
		
		String j = "";
		
		for(int i=0;i<n.length;i++)
		{
			j = j + n[i];
		}
		
		StringBuffer sb = new StringBuffer(j);
		sb.insert(2,'-');
		sb.insert(5,'-');
		sb.insert(9,'-');
		//sb.insert(sb.length(),'?');
		
		System.out.println(sb);
		

	}

}
