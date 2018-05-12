package Chapter5;

import java.util.Scanner;
public class ValidatingInviladInt 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number greater than 10");
		int num = -1;
		while (num <= 10)
		{
			System.out.println("Please enter a number greater than 10");
			num = input.nextInt();
		}
		{System.out.println("Good Job!");}
		
	}
}
