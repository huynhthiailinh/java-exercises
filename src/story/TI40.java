package story;

import java.util.Scanner;

public class TI40
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a = ");
		double a = sc.nextDouble();
		System.out.print("Enter b = ");
		double b = sc.nextDouble();
		System.out.print("Enter c = ");
		double c = sc.nextDouble();
		if(a==0)
		{
			if(b==0)
			{
				if(c==0) System.out.println("Phuong trinh vo so nghiem");
				else System.out.println("Phuong trinh vo nghiem");
			}
			else System.out.println("Phuong trinh co 1 nghiem: x = " + (-c/b));
		}
		else
		{
			double delta = b*b-4*a*c;
			double x1, x2;
			if(delta>0)
			{
				x1 = (double) (-b + Math.sqrt(delta))/(2*a);
				x2 = (double) (-b - Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + "; x2 = " + x2);
			}
			else if(delta==0)
			{
				x1 = x2 = (-b)/(2*a);
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
			}
			else System.out.println("Phuong trinh vo nghiem");
		}
	}
}
