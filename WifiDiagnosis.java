/*
 * Class: CMSC203 21076
 * Instructor: Prof. Khandan Monshi
 * Description: Build an application that will step through some possible problems to restore 
 * 		internet connectivity.  Assume that your computer uses wi-fi to connect to a router 
 * 		which connects to an Internet Service Provider (ISP) which connects to the Internet.
 * Due: 09/11/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michelle Eileen
*/

import java.util.Scanner;
public class WifiDiagnosis 
{
	public static void main (String[] args)
	{
		String decs;
		final String dq = "Did that fix the problem? (Yes or No)";
		Scanner input = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work");
		
		System.out.println("\nReboot the computer and try to connect"); //Q1
		System.out.println(dq);
		decs = input.nextLine();
		if (decs.equals("no"))
		{
			System.out.println("\nReboot the router and try to connect"); //Q2
			System.out.println(dq);
			decs = input.nextLine();
			if (decs.equals("no"))
			{
				System.out.println("\nMake sure the cables connecting the router are firmly plgged in and power is getting to the router"); //Q3
				System.out.println(dq);
				decs = input.nextLine();
				if (decs.equals("no"))
				{
					System.out.println("\nMove the computer closer to the router and try to connect"); //Q4
					System.out.println(dq);
					decs = input.nextLine();
					if (decs.equals("no"))
						System.out.println("\nContact your ISP");
					else if (decs.equals("yes"))
						System.out.println("\nDone!");
					else
						System.out.println("Invalid answer; try again");
				}
				else if (decs.equals("yes"))
					System.out.println("\nDone!");
				else
					System.out.println("Invalid answer; try again");
			}
			else if (decs.equals("yes"))
				System.out.println("\nDone!");
			else
				System.out.println("Invalid answer; try again");
		}
		else if (decs.equals("yes"))
			System.out.println("\nDone!");
		else
			System.out.println("Invalid answer; try again");
		
		System.out.println("Programmer: Michelle Eileen");
		input.close();
	}
}