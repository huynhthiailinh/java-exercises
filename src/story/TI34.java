package story;

import java.util.Scanner;

public class TI34 
{
	public void convertBinary(int num)
	{
		int binary[] = new int[40];
		int index = 0;
		while(num > 0)
		{
			binary[index++] = num%2;
			num = num/2;
		}
		for(int i=index-1; i>=0; i--)
		{
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args)
	{
		int decimalNumber;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		decimalNumber = in.nextInt();
		if(decimalNumber < 0) System.out.println("Error!");
		else
		{
			System.out.print("Convert to binary number is: ");
			new TI34().convertBinary(decimalNumber);
		}
		in.close();
	}
}

