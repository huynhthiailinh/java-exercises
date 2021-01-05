package story;

import java.util.Scanner;

public class TI41
{
	public static void main(String[] args)
	{
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month number: ");
		int month = sc.nextInt();
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		if(month<0 || month>12) System.out.println("Error!");
		else if(month==2)
		{
			if(((year%4)==0) && ((year%100)!=0)) System.out.println("February " + year + 
					" has 29 days");
			else System.out.println("February " + year + " has 28 days");
		}
		else if(month==1) System.out.println("January " + year + "has 31 days");
		else if(month==3) System.out.println("March " + year + "has 31 days");
		else if(month==4) System.out.println("April " + year + "has 30 days");
		else if(month==5) System.out.println("May " + year + "has 31 days");
		else if(month==6) System.out.println("June " + year + "has 30 days");
		else if(month==7) System.out.println("July " + year + "has 31 days");
		else if(month==8) System.out.println("August " + year + "has 31 days");
		else if(month==9) System.out.println("September " + year + "has 30 days");
		else if(month==10) System.out.println("October " + year + "has 30 days");
		else if(month==11) System.out.println("November " + year + "has 30 days");
		else if(month==12) System.out.println("December " + year + "has 31 days");
	}
}
