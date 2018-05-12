package Chapter5;

import java.util.Scanner;
public class LeapYearDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean  gregorianCorrection;
        int user;

        System.out.print("Please enter an year greater than 1582, or -1 to stop: ");
        user = input.nextInt();

        if (user != -1 && user < 1583){
            do {
                System.out.print(user + " Is an ILLEGAL year! Please Try Again: ");
                user = input.nextInt();
            } while (user != -1 && user < 1583);
            System.out.println("Thanks for using the program. Good Bye!");
        }
        else if (user == -1) {
            System.out.println("Thanks for using the program. Good Bye!");
        }
        else
        {

            if (user % 400 == 0 || (user % 4 == 0 && user % 100 != 0))
                System.out.println("Congrats, " + user + " is a leap year.");
            else
                System.out.println("Sorry but " + user + " is not a leap year.");
        }
    }
}
