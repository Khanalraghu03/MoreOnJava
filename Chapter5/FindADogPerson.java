package Chapter5;

import java.util.Scanner;
public class FindADogPerson
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//if not in range, false!

		System.out.println("Please enter your age: ");

		while(!input.hasNextInt())
		{
	        input.next();
	        System.out.println("Please enter age in terms of number: ");
	    } int age = input.nextInt();
		while (age < 1)
	    {
	    	System.out.println("Please enter a valid age: ");
	    	age = input.nextInt();
	    }

//		while(age != int) {
//		    System.out.println("Please enter your age as an Integer: ");
//		    age = input.nextInt();
//		}
		//int timeToWalk

		//Must meet this criterias


		//Must be age of 25 through 50

		if (age >= 25 && age <= 50)
		{
			boolean smoking = true;
			System.out.println("Do you Smoke? Enter Yes or No : "); //Does user smoke?
			String smoke = input.next();
			//Must enter Yes or No exactly
			// if user enters something other than Yes, yes, No , or no then keep asking the same question

			while (!(smoke.equals("Yes") || smoke.equals("yes")) && !(smoke.equals("No") || smoke.equals("no")))
			{
					System.out.println("Please enter Yes or No ");
					smoke = input.next();
			//cannot be a smoker
			}

			
			// If user inputs Yes or yes, they are smoker: and are not eligible
			
			if (smoke.equals("Yes") || smoke.equals("yes"))
			{
				smoking = false;
				System.out.println("Sorry, you are not eligible!");
			} 
			
			else
			{
				//If they answer No or no, then we precede to the next step.
				
				boolean dogOwnedHistory = true;
				
				//Did user owned a dog before?
				System.out.println("Have you owned a dog before? Enter 'Yes' or 'No': ");
				String OwnedHistory = input.next();
				
				// if user enters something other than Yes, yes, No , or no then keep asking the same question
				while (!(OwnedHistory.equals("Yes") || OwnedHistory.equals("yes")) && !(OwnedHistory.equals("No") || OwnedHistory.equals("no")))
				{
					System.out.println("Please enter Yes or No : ");
					OwnedHistory = input.next();	
				}
				
				//If user input No, or no, then they are disqualified
				if (OwnedHistory.equals("No") || OwnedHistory.equals("no"))
				{
					dogOwnedHistory = false;
					System.out.println("Sorry, you are not eligible!");
				}
				
				//If they enter Yes or yes then we preceed to the next question
				else
				{
					boolean canWalkTheDog = true;
					
					//Ask use if they are able
					System.out.println("Are you able to walk the dog? Enter 'Yes' or 'No': ");
					String ableToWalkTheDog = input.next();
					
					// if user enters something other than Yes, yes, No , or no then keep asking the same question
					while (!(ableToWalkTheDog.equals("Yes") || ableToWalkTheDog.equals("yes")) && !(ableToWalkTheDog.equals("No") || ableToWalkTheDog.equals("no")))
					{
						System.out.println("Please enter 'Yes' or 'No' ");
						ableToWalkTheDog = input.next();
					}
					//If Unable
					if (ableToWalkTheDog.equals("No") || ableToWalkTheDog.equals("no"))
					{
						canWalkTheDog = false;
						System.out.println("Sorry, you are not eligible!");
					}
					else
					{
					
						//If Able, how many times a day?
						boolean frequency = true;
						
						System.out.println("How many times are you able to walk the dog? ");
						while(!input.hasNextInt())
						{
					        input.next();
					        System.out.println("Please enter frequency in terms of number: ");
					    }
						
						int timeToWalk = input.nextInt();
						//If age entered is less than 0, that not valid age
						
						while (timeToWalk < 0)
					    {
					    	System.out.println("Please enter a valid frequency time: ");
					    	timeToWalk = input.nextInt();
					    }
					    
					    if (timeToWalk < 2)
					    {
					    	frequency = false;
					    	System.out.println("Sorry, you are not eligible!");
					    }
						
					    else
					    {
					    
						    boolean jobStatus = true;
						    System.out.println("Do you have a job to take care of dogs?  Enter 'Yes' or 'No': ");
							String statusJob = input.next();
							
							while (!(statusJob.equals("Yes") || statusJob.equals("yes")) && !(statusJob.equals("No") || statusJob.equals("no")))
							{
								System.out.println("Please enter 'Yes' or 'No' ");
								statusJob = input.next();
							}
							
							if (statusJob.equals("No") || statusJob.equals("no"))
							{
								jobStatus = false;
								System.out.println("Sorry, you are not eligible!");
							}
							
							else
							{
								boolean mustBeADogPerson = true;
								System.out.println("Are you a dog lover or a dog person? Enter 'Yes' or 'No': ");
								String itMustBeADogPerson = input.next();
								while (!(itMustBeADogPerson.equals("Yes") || itMustBeADogPerson.equals("yes")) && !(itMustBeADogPerson.equals("No") || itMustBeADogPerson.equals("no")))
								{
									System.out.println("Please enter 'Yes' or 'No' ");
									itMustBeADogPerson = input.next();
								}
								
								if (itMustBeADogPerson.equals("No") || itMustBeADogPerson.equals("no"))
								{
									mustBeADogPerson = false;
									System.out.println("Sorry, you are not eligible!");
								}
								else
								{
									
									System.out.println("Congratulation, You can be the Dog Person!!");
								}
							}
							
					    }
					   
					}
					
				}
				
			}
			
		}
		else
		{
			System.out.println("Sorry, you are not eligible! Good Bye!");
		}
	}
}
