package set47;
/*
10. arraylist of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student who has scored max marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak
 */

public class arraylistStudent_10 {
	public static void main(String[] args) {

		String student[] = { "arun#12#12#12", "deepak#13#12#12", "manoj#12#25#12" };
		int add = 0;
		int total = 0;
		String name = "";

		for (int i = 0; i < student.length; i++) {

			String a = student[i];
			String b[] = a.split("#");
			for (int j = 1; j < b.length; j++) {

				String c = b[j];
				int no = Integer.parseInt(c);
				add = add + no;
			}
			if (total < add) {
				total = add;
				name = b[0];
			}
			add = 0;
		}

		System.out.println("The name of the student who scored max marks is " + name + " & marks are " + total);
	}

}
