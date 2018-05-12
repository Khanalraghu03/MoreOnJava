package Chapter5;

import java.util.Scanner;
public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // use final String, for variable name vowles: express it as aeiou lowercase and uppercase
        final String vowels = "AEIOUaeiou";

        //ask the user for a word
        System.out.println("Please enter a word or press -1 to exit: ");
        String word = sc.nextLine(); /* save the word user type as the variable word */
        
        //While -1 is not typed by the user:
        while (!word.equalsIgnoreCase("-1"))
        {
            //letter or letters before vowels are assigned as empty string
            String lettersBeforeVowel = "";
            //initialize trim to 0
            int trim = 0;

            //while trim is less than the length of the word, that user typed.
                //  & . the final String vowel contains "" + at the first letter
            while (trim < word.length() && !vowels.contains("" + word.charAt(trim)))
            {
                   // lettersBeforeVowel = lettersBeforeVowel + the first letter of the word
                        // trim++ makes it lettersBeforeVowel = lettersBeforeVowel + 2nd letter of word...
                            // until end of the word
                lettersBeforeVowel += word.charAt(trim);
                //increment trim
                trim++;
            }
            if (trim == 0)
            {
                // make trim = 1
                trim = 1;
                // increment word by the first letter of the word user input and empty string next to it
                word += word.charAt(0) + "";
            }

            //Print the trim word, and a -, and bring the letter(s) that was before vowels and add ay to it.
            System.out.println(word.substring(trim) + "-" + lettersBeforeVowel + "ay");

            //Ask users for input again:
            System.out.println("Please enter your next word or -1 to exit: ");
            word = sc.nextLine();
        }
    }
}