package Chapter5; /**
 * @author: Hannah Conner
 * @date: March 18, 2018
 * @version: 2
 * @description: MadLibs made in class, made madlibs into a while loop
 */
import java.util.Scanner;
public class SandyFriend 
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Do you want to play this game again? if yes, enter 1 or 0 to stop");
		int decision = input.nextInt();
		
		do {

		//Enter adjective 1.
		//Today I went to the (adj1)
		System.out.print("Enter a adjective: ");
		String adj1 = input.nextLine();

		//Enter verb 1.
		//store. I (verb1)
		System.out.print("Enter an past tense verb: ");
		String verb1 = input.nextLine();

		//Enter noun 1
		//to buy some (noun1).
		System.out.print("Enter a plural noun: ");
		String noun1 = input.nextLine();

		//Enter verb2
		//I (verb2)
		System.out.print("Enter a past tense verb: ");
		String verb2 = input.nextLine();

		//Enter noun 2
		//some (noun2).
		System.out.print("Enter a noun: ");
		String noun2 = input.next();

		//Enter noun3
		//The (noun3)
		System.out.print("Enter a noun: ");
		String noun3 = input.next();

		//Enter adjective 2
		//tasted (adj2).
		System.out.print("Enter an adjective: ");
		String adj2 = input.next();

		//Enter an integer
		//I also bought (number1)
		System.out.print("Enter an integer: ");
		int number1 = input.nextInt();

		//Enter noun 4
		//(noun4).
		System.out.print("Enter a plural noun: ");
		String noun4 = input.next();

		//Enter adjective 3
		//They were very (adj2).
		System.out.print("Enter an adjective: ");
		String adj3 = input.next();

		//Enter adjective 4
		//Then I went to the (adj4)
		System.out.print("Enter an adjective: ");
		String adj4 = input.next();

		//Enter adjective 5
		//store. It was very (adj5).
		System.out.print("Enter an adjective: ");
		String adj5 = input.next();

		//Enter verb 3
		//I quickly (verb3).
		System.out.print("Enter a verb: ");
		String verb3 = input.next();

		//Enter verb 4
		//Once I got outside it was (verb4).
		System.out.print("Enter a verb ending in -ing: ");
		String verb4 = input.next();

		//Enter noun 5
		//I opened my (noun5)
		System.out.print("Enter a noun: ");
		String noun5 = input.next();

		//Enter verb 5
		//to (verb5)
		System.out.print("Enter a verb: ");
		String verb5= input.next();

		//Enter noun 6
		//me from the rain, but there were (noun6)
		System.out.print("Enter a plural noun: ");
		String noun6 = input.next();

		//Enter verb 6
		//in my umbrella. I (verb6)
		System.out.print("Enter a verb: ");
		String verb6 = input.next();

		//Enter adjective 6
		//my (adj6)
		System.out.print("Enter an adjective: ");
		String adj6 = input.next();

		//Enter noun 7
		//broken (noun7)
		System.out.print("Enter a noun: ");
		String noun7 = input.next();

		//Enter noun 8
		//in the trash. I decided to return to (noun8).
		System.out.print("Enter a place: ");
		String noun8 = input.next();

		//Enter verb 7
		//When I (verb7)
		System.out.print("Enter a past tense verb: ");
		String verb7 = input.next();

		//Enter noun 9
		//(noun9)
		System.out.print("Enter a place: ");
		String noun9 = input.next();

		//Enter adjective 7
		//I was (adj7)
		System.out.print("Enter a past tense adjective: ");
		String adj7 = input.next();

		//Enter noun 10
		//to see my (noun10).
		System.out.print("Enter a noun: ");
		String noun10 = input.next();

		//Enter verb 8
		//I will not be (verb8)
		System.out.print("Enter an -ing verb: ");
		String verb8 = input.next();

		//Enter adjective 8
		//home soon. I hope tomorrow is (adj8).
		System.out.print("Enter an adjective: ");
		String adj8 = input.next();

		//Enter verb 9
		//I can't (verb9)
		System.out.print("Enter a verb: ");
		String verb9 = input.next();

		//Enter adjective 9
		//to see what tomorrow brings. Hopefully, it will be (adj9)
		System.out.print("Enter a comparative adjective: ");
		String adj9 = input.next();

		//Enter verb 10
		//than today. I (verb10)
		System.out.print("Enter a verb: ");
		String verb10 = input.next();

		//Enter adjective 10
		//have to return to the (adj10) store.
		System.out.print("Enter an adjective: ");
		String adj10 = input.next();
		
		//All of the inputs are completed
	



//Prints out the entire paragraph with input for the blanks

		System.out.println("Today, I went to the "+ adj1+ " store. I "+ verb1 + " to buy some "+ noun1+ "");

		System.out.println("I "+ verb2+ " some "+ noun2 +". The "+ noun3+ " tasted "+adj2+ ". I also bought "+

				number1 + " " + noun4 + ". They were very " + adj3 + "");

		System.out.println("Then I went to the "+ adj4 + " store. It was very "+adj5+ ". I quickly ");

		System.out.println(verb3 + ". Once I got outside it was " + verb4 + ". I opened my "+ noun5);

		System.out.println(" to " +verb5 + " myself from the rain, but there were "+ noun6 + " in my umbrella. I ");

		System.out.println(verb6 + " my "+ adj6 +" "+ noun7+ " in the trash. I decided to return to "+ noun8 + "");

		System.out.println(" When I " + verb7 +" "+ noun9 + " I was "+ adj7 + " to see my "+ noun10 + "");

		System.out.println("I will not be " + verb8 + " home soon. I hope tomorrow is "+ adj8 + ". I can't ");

		System.out.println(verb9 + " to see what tomorrow brings. Hopefully, it will be " + adj9 + " than today.");

		System.out.println("I  have to "+ verb10 +" to the " + adj10 + " store then.");
		}	while(decision < 1 || decision > 1);
		
	
		

	}
}
