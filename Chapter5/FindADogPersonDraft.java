package Chapter5; /**
 * @ Author: Raghu
 * @ Date: 03/23/2018
 * @About: This program will validate if the person is eligible to be a dogPerson.
 */
import java.util.Scanner;
public class FindADogPersonDraft
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		

		System.out.println("Please enter your age: ");
		
		//I want age in terms of number not words.
		while(!input.hasNextInt()) {
	        input.next();
	        System.out.println("Please enter age in terms of number: ");
	    }
		int age = input.nextInt();
		
		//If age entered is less than 0, that not valid age
	    while (age < 0)
	    {
	    	System.out.println("Please enter a valid age: ");
	    	age = input.nextInt();
	    }
		
		//Age must be in range of 25 - 50
		if (age >= 25 && age <=50 )
			{
				System.out.println("Do you Smoke? Enter 'Yes' or 'No': ");
				String smoking = input.next();
				//Must enter Yes or No exactly
				
				while (!smoking.equals("Yes") && !smoking.equals("No"))
				{
					System.out.println("Please enter 'Yes' or 'No' with correct spelling");
					smoking = input.next();	
				} //cannot be a smoker
				if (smoking.equals("No"))
				{
					System.out.println("Have you owned a dog before? Enter 'Yes' or 'No': ");
					String dogOwnedHistory = input.next();
					
					while (!dogOwnedHistory.equals("Yes") && !dogOwnedHistory.equals("No"))
					{
						System.out.println("Please Enter 'Yes' or 'No' with correct spelling");
						dogOwnedHistory = input.next();
					}
					if (dogOwnedHistory.equals("Yes"))
					{
						System.out.println("Are you able to walk the dog? Enter 'Yes' or 'No': ");
						String canWalkTheDog = input.next();
						
						while (!canWalkTheDog.equals("Yes") && !canWalkTheDog.equals("No"))
						{
							System.out.println("Please Enter 'Yes' or 'No' with correct spelling");
							canWalkTheDog = input.next();
						}
						if (canWalkTheDog.equals("Yes"))
						{
							System.out.println("Are you able to walk the dog at least two times a day? Enter 'Yes' or 'No': ");
							String timeToWalk = input.next();
							
							while (!timeToWalk.equals("Yes") && !timeToWalk.equals("No"))
							{
								System.out.println("Please Enter 'Yes' or 'No' with correct spelling");
								timeToWalk = input.next();
							}
							if (timeToWalk.equals("Yes"))
							{
								System.out.println("Do you have a job to take care of dogs?  Enter 'Yes' or 'No': ");
								String jobStatus = input.next();
								
								while (!jobStatus.equals("Yes") && !jobStatus.equals("No"))
								{
									System.out.println("Please Enter 'Yes' or 'No' with correct spelling");
									jobStatus = input.next();
								}
								if (jobStatus.equals("Yes"))
								{
									System.out.println("Are you a dog lover or a dog person? Enter 'Yes' or 'No': ");
									String mustBeADogPerson = input.next();
									
									while (!mustBeADogPerson.equals("Yes") && !mustBeADogPerson.equals("No"))
									{
										System.out.println("Please Enter 'Yes' or 'No' with correct spelling");
										mustBeADogPerson = input.next();
									}
										
										if (mustBeADogPerson.equals("Yes"))
										{
											System.out.println("Congrats! You can be the dog person to take care of this dog I rescued!");
										}
										else
										{
											System.out.println("Sorry, You are not eligible to be the Dog Person. ");
										}
									
								}
								else
								{
									System.out.println("Sorry, You are not eligible to be the Dog Person. ");
								}
							}
							else
							{
								System.out.println("Sorry, You are not eligible to be the Dog Person. ");
							}
						}
						else
						{
							System.out.println("Sorry, You are not eligible to be the Dog Person. ");
						}
					}
					
					else
					{
						System.out.println("Sorry, You are not eligible to be the Dog Person. ");
					}
				}
				else
				{
					System.out.println("Sorry, You are not eligible to be the Dog Person. ");
				}
			}
		else
		{
			System.out.println("Sorry, You are not eligible to be the Dog Person. ");
		}
	}
}
