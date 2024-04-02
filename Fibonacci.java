/* 2.wirte a code to find a Fibonacci series upto the nth term. */

import java.util.Scanner;
class Fibonacci
{
	public static int fibonacci(int n)
	{
		int n1 = 0,n2 = 1,n3 = 0;
		for(int i = 2 ; i < n ; i++)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Output:"+fibonacci(n));
	}
}