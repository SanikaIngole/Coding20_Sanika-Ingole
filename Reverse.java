/* 1.Write a code to reverse a number. */

import java.util.Scanner;
class Reverse 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int reversedNumber = reverseNumber(number);
		System.out.println("Reversed number:"+reversedNumber);
	}
	public static int reverseNumber(int num)
	{
		int reversed = 0;
		while(num!=0)
		{
			int digit = num % 10;
			reversed = reversed + 10 + digit;
			num /= 10;
		}
		return reversed;
	}
}