package Chapter5;

import java.util.Scanner;
public class ValidatingUserInput2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number greater than 10");
		int num;
		do
		{
			System.out.println("Please enter a number greater than 10");
			num = input.nextInt();
		}
		while (num <= 10);
		{System.out.println("Good Job");}
		
	}
}
