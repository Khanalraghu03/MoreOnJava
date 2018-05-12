package Chapter5;

import java.util.Scanner;
public class TwoDiceGame {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("The Game of Rolling 2 Dice");
		
		int x, y;
		
		do
		{
			x = (int)(Math.random() * 7);
			y = (int)(Math.random() * 7);
			System.out.println("Current x is : "+ x + " and current y is: " + y );
			System.out.println("Nope, Try again!");
			System.out.println("");
			
		} while (x != y); 
		System.out.println(x);
		System.out.println(y);
		System.out.println("You Win");
	}
}
