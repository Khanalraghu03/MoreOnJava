package Chapter5;

import java.util.Scanner;
public class Somew
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Ask user for a string
        System.out.print("Please enter a string: ");
        String string = input.nextLine();

        //Set lowerCase to an empty string
        String lowerCase = "";

        //as long as i remains less than the length of string that user inputs,
        //keep doing such:

        int i = 0;
        while (i < string.length())
        {
            //
            char lowerCasetheASCII = string.charAt(i);

            if (lowerCasetheASCII >= 97 && lowerCasetheASCII <= 122)
            {
                lowerCase += lowerCasetheASCII;
            }

            i++;
        }

        System.out.println("The count of the lower case is: " + lowerCase.length());
        System.out.println("The lower case letters for your strings are: " + lowerCase);

    }
}
