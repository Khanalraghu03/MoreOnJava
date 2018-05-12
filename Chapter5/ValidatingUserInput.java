package Chapter5;

import java.util.Scanner;
public class ValidatingUserInput 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number greater than 10");
		int num = input.nextInt();
		while (num <= 10)
		{
			System.out.println("Please enter a number greater than 10");
			num = input.nextInt();
		}
		System.out.println("Great Job!: " + num);
	}
}
