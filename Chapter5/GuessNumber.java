package Chapter5;

import java.util.Scanner;
public class GuessNumber 
{
	public static void main(String[] agrs)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a Number: ");
		int number = input.nextInt();
		while (number != 1 && number != 13)
		{
			System.out.println("Guess again!");
			number = input.nextInt();
			
		}
		System.out.println("Good Job!");
	}
}
