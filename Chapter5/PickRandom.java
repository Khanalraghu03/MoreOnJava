package Chapter5;

import java.util.Scanner;
public class PickRandom 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x;
		do 
		{
			x = Math.random();
			System.out.println("Got " + x);
			System.out.printf("Got %.2f\n", x);
		} while (x < 0.9);
		
	}
}
