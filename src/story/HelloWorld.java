package story;

import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Decimal Number: " + number);
		System.out.println("Binary Number: " + Integer.toBinaryString(number));
	}
}