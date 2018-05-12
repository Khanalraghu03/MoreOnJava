import java.util.Scanner;
public class TelephoneNumber 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10-digit telephone number: ");
		String telephone, areaCode,exchange,number;
		telephone = input.nextLine();
		areaCode = telephone.substring(0,3);
		exchange = telephone.substring(3,6);
		number = telephone.substring(6);
		
		System.out.println("You entered "+ telephone);
		System.out.println("The area code is "+ areaCode);
		System.out.println("The exchange is "+ exchange);
		System.out.println("The number is " + number);
		
		System.out.println("The complete telephone number is " +
				"(" + areaCode + ")" + exchange + "-" + number);
	}
}
