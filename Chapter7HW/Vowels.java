package Chapter7HW;
/*
*@author: Raghu Khanal
*@description: This program will print how many vowels user input in the AEIOU order
*/
import java.util.Scanner;
public class Vowels {
    public static void main(String args[]) {
        //To let the user be able to input
        Scanner input = new Scanner(System.in);

        int theVowels[] = new int[5];
        //Tell the users what this program is about
        System.out.println("This program will print how many vowels user input in the AEIOU order\n\n");

        //I want a String from user
        System.out.print("Please type something, and I will guess the number of vowels you entered: ");
        String something = input.nextLine();

        theVowels = numberOfVowels(something);

        System.out.println("[" + theVowels[0] + ", " + theVowels[1] + ", "
                + theVowels[2] + ", " + theVowels[3] + ", " + theVowels[4] + "]");
    }

    public static int[] numberOfVowels(String vowels) {
        int numOfVowels[] = new int[5];
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'A') {
                numOfVowels[0]++;
            } else if (vowels.charAt(i) == 'e' || vowels.charAt(i) == 'E') {
                numOfVowels[1]++;
            } else if (vowels.charAt(i) == 'i' || vowels.charAt(i) == 'I') {
                numOfVowels[2]++;
            } else if (vowels.charAt(i) == 'o' || vowels.charAt(i) == 'O') {
                numOfVowels[3]++;
            } else if (vowels.charAt(i) == 'u' || vowels.charAt(i) == 'U') {
                numOfVowels[4]++;
            }
        }
        return numOfVowels;
    }
}
