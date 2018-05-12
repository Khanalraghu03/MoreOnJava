package Chapter5; /**
 * 
 * @author SANDY Ali
 *@date: 03/19/2018
 *@description: Made Madlibs into a while loop
 *Purpose: Mad Libs is a funny story of a day in the life of college student which shows how to spend your day as a college student in a silly way.
 */

import java.util.Scanner;
public class SandyProject 
{
	public static void main(String [] args)
	{
		/*
 * Always to declare a variable
 * 1) Date type
 * 2) name of the variable
 * 3) semicolon ;
 * Int nameVariable = 5;
 */
		
		//Create an instance of Scanner class
		//Scanner is the name of the class, input is the object or the instance for the data method
		Scanner box = new Scanner(System.in);
		
		System.out.println("Enter Y to play and N to stop playing.");
		String decision = box.nextLine();
		
		while(decision!="N" || decision!="n") {
		
		//Always ask the user something first then create a scanner to store their answer.
		//To display something in the console always used SYSOUT.
		System.out.print("Enter Time Span:");
		double TimeSpan = box.nextDouble();
		
		//Variable for to store users answer
		//Datatype: Name of the variable; name of the object.NextLine() since this is 
		//If it was a double or integer it would be .nextInt() or .nextDouble()
		
		System.out.println(" Please enter a noun" );
		String noun1 = box.next();
	
		//Create a string for user to input
		
		System.out.println("Enter a verb");
		String verb1 = box.next();
		
		System.out.println(" Enter a verb");
		String verb2 = box.next();
		
		System.out.println("Please enter a NOUN (PLURAL OR SINGULAR)");
		String noun2 = box.next();
		
		System.out.println("Enter a noun");
		String noun3 = box.next();
		
		System.out.println("Please enter a VERB ENDING IN ING ");
		String verb3 = box.next();
		
		System.out.println(" Please enter OCCUPATION ");
		String occupation = box.nextLine();
		
		System.out.println("Enter a noun ");
		String noun4 = box.next();
		
		System.out.println(" Enter a noun ");
		String noun5 = box.next();
		
		System.out.println("Please enter a name of FAMOUS PERSON");
		String famousperson = box.next();
		
		System.out.println("Enter an Adjective");
		String Adjective1 = box.next();
		
		System.out.println("Enter a verb");
		String verb4 = box.next();
		
		System.out.println(" Enter a noun");
		String noun6 = box.next();
		
		System.out.println(" Please enter a NOUN (PLURAL) ");
		String nounPlr1 = box.next();
		
		System.out.println("Enter an Adjective ");
		String Adjective2 = box.next();
		
		System.out.println("Please enter a NOUN (PLURAL)");
		String nounPlr2 = box.next();
		
		System.out.println("Enter a verb");
		String verb5 = box.next();
		
		System.out.println("Please enter a Preposition");
		String prePos1 = box.next();
		
		System.out.println("Enter a verb");
		String verb6 = box.next();
		
		System.out.println("Enter an Adjective");
		String Adjective3 = box.next();
		
		System.out.println(" Enter a noun");
		String noun7 = box.next();
		
		System.out.println("Enter a verb");
		String verb7 = box.next();
		
		System.out.println("Enter an Adjective");
		String adjective4 = box.next();
		
		// Write the final print
		
		System.out.printf(" Every " + TimeSpan +", I wake up and get off my " + noun1+ " I don't always have time to"
				+ "" + verb1+" a shower, but I always make sure to " + verb2+" my hair. Once that's done"
						+ " I get some " + noun2+", and then it's off to my first " + noun3+ ""
								+ " I often get caught " + verb3+" in class. No one likes it when the " + occupation
								+" gives a surprise"
										+ " " + noun4+". My second class is " + noun5+" Theory.Dr. " +famousperson
										+" is incredibly " + Adjective1+""
												+ ", but I never " + verb4+" him because of his thick " + noun6+". Her " + nounPlr1+", however,are"
														+ " really " + Adjective2
														+". After lunch, I have no more "+ nounPlr2+" and I'm free to " + verb5+""
																+ " " + prePos1+" my friends. Before I go to bed I " + verb6
			+" a little bit. " + Adjective3 + noun7 + verb7 + adjective4+".");
		
		// Make sure to close the box.
		box.close();
	}
}
}
		
	
