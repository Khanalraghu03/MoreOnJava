package Chapter5;

import java.util.Scanner;
public class MyMadLibFinal
{
	public static void main(String[] args)
	{
		Scanner box = new Scanner(System.in);
		
//		System.out.println("Enter Y to play  or N to quit");
//		String answer = box.next();
		
		//purpose?
		//if !(answer.equals('Y')) || !(answer.equals('N')
		//{
		//System.out.println("Please enter Y or N: ");
		//answer = box.next();
		//}
		System.out.println("Would you like to play? Please enter yes or no.");
		String answer = box.nextLine().toLowerCase();
		
		//first variable is answer. This gets the game started. by jumping into the first loop.
		while (answer.equals("yes")) 
		{
			//The second variable playAgain, ensures that the user gets as many trials as he would like.
			boolean playAgain = true;
			while (playAgain)
				{
					System.out.println("The Trip");
					
					System.out.println("Enter the first adjective: ");
					String adjective1 = box.next();
					
					System.out.println("Enter a location: ");
					String location1 = box.next();
					
					System.out.println("Enter a noun: ");
					String noun1 = box.next();
					
					System.out.println("Enter a feeling here: ");
					String feeling1 = box.next();
					
					System.out.println("Enter a verb here: ");
					String verb1 = box.next();
			
					System.out.println("Enter another feeling here: ");
					String feeling2 = box.next();
					
					System.out.println("Enter another noun: ");
					String noun2 = box.next();
					
					System.out.println("Enter a animal name: ");
					String animal1 = box.next();
					
					System.out.println("Enter a object name: ");
					String object1 = box.next();
					
					System.out.println("Enter the second adjective: ");
					String adjective2 = box.next();
					
					System.out.println("Enter a noun: ");
					String noun3 = box.next();
					
					System.out.println("Enter a expression here: ");
					String expression1 = box.next();
					
					System.out.println("Enter a Proper Noun: ");
					String noun4 = box.next();
					
					System.out.println("Enter an Adjective: ");
					String adjective3 = box.next();
					
					System.out.println("Enter a emotion: ");
					String emotion1 = box.next();
					
					System.out.println("Enter an Adjective: ");
					String adjective4 = box.next();
					
					System.out.println("Enter a fun place here: ");
					String place1 = box.next();
			
					System.out.println("Enter a weekday: ");
					String day = box.next();
					
					System.out.println("Enter a intense feeling: ");
					String ifeeling = box.next();
					
					System.out.println("Enter a action verb: ");
					String averb = box.next();
					
					System.out.println("Enter a adverb: ");
					String adverb = box.next();
					
					System.out.println("Enter a noun: ");
					String noun5 = box.next();
					
					System.out.println("Enter a noun: ");
					String noun6 = box.next();
					
					System.out.println("Enter a verb: ");
					String bverb = box.next();
					
					System.out.println("Enter a profession: ");
					String profession = box.next();
					
					System.out.println("Enter a verb: ");
					String cverb = box.next();
					
					System.out.println("Enter a verb: ");
					String dverb = box.next();
					
					System.out.println("Enter a verb: ");
					String everb = box.next();
					
					System.out.println("Enter an adverb: ");
					String adverb2 = box.next();
					
					System.out.println("Enter a noun: ");
					String noun7 = box.next();
					
					System.out.println("When I was " + adjective1 + ", I went to the " + location1+ "");
					System.out.println("There I saw " + noun1+ "");
					System.out.println("This made me feel " + feeling1 + " and to my surprise I found myself " + verb1+ "");
					System.out.println("After a while, I begun to feel like " + feeling2 + " So, I went to the " + noun2 + " and " + adjective2 + "");
					System.out.println("I then realize that I was next to a " + animal1 + " I got hit by a huge " + object1+ "");
					System.out.println("It was a " + adjective2 + " " + noun3 + " that begun to " + expression1+ "");
					System.out.println("One of my friend named " + noun4 + " also got suspicious and offer to " + adjective3+ "");
					System.out.println("He/She became very " + emotion1 + " and our life became " + adjective4+ "");
					System.out.println("So we both decided to go " + place1 + " even though it was " + day+ "");
					System.out.println("Our lives was filled with " + ifeeling+ "");
					System.out.println("From then on, I had never " + averb+ "");
					System.out.println("I felt " + adverb + " joy and peace, it felt like I was in a " + noun5+ "");
					System.out.println("I wanted some " + noun6 + " I will " + bverb + " for you.");
					System.out.println("So I chose to be a " + profession + " due to the work " + cverb + "I did.");
					System.out.println("Unfortunately, I wasn't " + dverb + " but I continued to " + everb+ "");
					System.out.println("So I understood and I " + adverb2 + " stated to take " + noun7 + " less seriously.");
					
					//ends the first loop, so that it stops repeating or bouncing back into the game
					playAgain = false;
			}
			//This one takes us out of the first loop so that we can get out of the game completely. 
			System.out.println("Would you like to play again? please answer yes or no");
			answer = box.next().toLowerCase();	
		}
		
		//Goodbye
		System.out.println("Game Over!!");
		
		
//		else if (answer.equals('N') || answer.equals('n'))
//			System.out.println("Game Over");
			
		
		
	}
}