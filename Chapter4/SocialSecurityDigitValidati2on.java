import java.util.Scanner;
public class SocialSecurityDigitValidati2on 
{
	public static void main(String[] args) 
	{ 
	//Show this to user
	System.out.println("Enter Your Social Security Number in the format DDD-DD-DDDD. " + "You must follow the format. "); 
	System.out.println("Otherwise, this program will complain that your number is invalid. "); 
	System.out.print("social security number: "); 
	
	//instantiate Scanner class and declare variable ssn
	Scanner input = new Scanner(System.in); 
	String ssn = input.nextLine();   
		
	//If statement establishes parameter
		if(ssn.length() == 11 && ssn.charAt(0) <= '9' && ssn.charAt(0)>= '0' && 
			Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2)) &&   
			ssn.charAt(3) == '-' && Character.isDigit(ssn.charAt(4)) &&    
			Character.isDigit(ssn.charAt(5)) && ssn.charAt(6) == '-' &&    
			Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) &&        
			Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10))) 
		
				{ 
					System.out.println(ssn + " is a valid social security number."); 
					System.out.print("Enter the last four digit number of your security number: "); //asking user 
					String yourLast4Digit = input.nextLine(); //taking users answer
					
					if(yourLast4Digit.equals(ssn.substring(7))) //check ssn from index seven on to end of string to see if it matches yourLas4
						{
							System.out.println("Your last four digit ssn is matching with the first ssn number you entered."); 
							System.out.println("Your last four digit number is " + ssn.substring(7));
						}
				
					else
						{
							System.out.println("Not matching!");   
						}
				}
	
		else
			{
				System.out.println(ssn + " is an invalid social security number or invalid format");
			}
	}
}