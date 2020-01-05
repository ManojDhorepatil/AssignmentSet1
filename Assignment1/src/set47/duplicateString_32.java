package set47;

import java.util.LinkedHashSet;

/*
32.Write a Program that accepts a string and removes the duplicate characters.
 */

import java.util.Scanner;

public class duplicateString_32 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.nextLine();
		String newString = "";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			hs.add(c);
		}
		
		for(char j : hs)
		{
			newString = newString + j;
		}
		
		System.out.println(newString);
				
	}
}
