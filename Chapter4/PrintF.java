import java.util.Scanner;
public class PrintF 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hello World");
		
		double i = 5.8705423;
		int j = 4;
		double k = i + j;
		
		System.out.println("The answer of " + i + " plus " + j + " is " + k);
		
		//first %d correspond to the first thing variable after comma
			//second %d - second variable... 
		System.out.printf("The answer of %.3f plus %d is %.3f\n", i,j,k);
		
		//The number 5.4433333: Give me a float and srunk it to 3 (floating point) decimal-- .3f
		//8 = the space from the begaining: which is (k) 9.
			// Go 8 spaces to right from current stage.
		System.out.printf("The answer is: %8.5f", k);
		
		
		if (j > k)
			System.out.printf("%d and %d is %b",j, k);
	}
}
