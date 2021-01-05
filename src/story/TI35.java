package story;

import java.util.Scanner;

public class TI35
{
	public static void main(String[] args)
	{
		int a, tong=0;
		System.out.print("Enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number>0)
		{
			a = number%10;
			number /= 10;
			tong += a;
		}
		System.out.println("The sum of digits is: " + tong);
	}
}
