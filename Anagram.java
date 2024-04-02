/* Write a code to Check if two strings are Anagram or not. */

import java.util.Scanner;
import java.util.Arrays;
class Anagram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String");
		String s2 = sc.nextLine();
		s1 = s1.trim().replaceAll("\\s","");
		s2 = s2.trim().replaceAll("\\s","");
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			char st1[] = s1.toLowerCase().toCharArray();
			char st2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(st1);
			Arrays.sort(st2);
			if(Arrays.equals(st1,st2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}
}