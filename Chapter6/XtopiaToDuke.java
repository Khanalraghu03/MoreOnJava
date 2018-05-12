package Chapter6;
import java.util.Scanner;
public class XtopiaToDuke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of the candidate: ");
        int age = input.nextInt();

        System.out.print("Enter years of X-TOPIAN citizenship: ");
        int lengthOfCitizenship = input.nextInt();

        eligibleForDuke(age, lengthOfCitizenship);
        eligibleForViscount(age, lengthOfCitizenship);


//
//        boolean eligible = true;
//        eligible.eligibleForDuke();

        /*if (age >= 25 && lengthOfCitizenship >= 7)
        {
            canBeDuke = true;
            if (age >= 30 && lengthOfCitizenship >= 9)
            {
                canGetViscount = true;
                System.out.print("The candidate is eligible for both election to the Duke and for Viscount.");
            }
            else
            {
                canGetViscount = false;
                System.out.print("The candidate is eligible for election to the Duke but NOT eligible for Viscount.");
            }
        }
        else {
            canBeDuke = false;
            System.out.println("The candidate is NOT eligible for election to either the Duke and for Viscount.");
        }*/
    }


    //global variable that is accessible to everyone and static
    public static boolean duke;


    //method
    //return type
    public static boolean eligibleForDuke(int age, int lengthOfCitizenship) {
        boolean canBeDuke = true;
        if (age >= 25 && lengthOfCitizenship >= 7) {
            System.out.println("Hey I am eligible for Dukeness.");
            duke = true;
            return true;

        } else {
            System.out.println("The candidate is NOT eligible for election to either the Duke and for Viscount.");
            duke = false;
            return false;
        }

    }

    public static boolean eligibleForViscount(int age, int lengthOfCitizenship) {
        //canGetViscount = true;
        while (duke) {
            if (age >= 30 && lengthOfCitizenship >= 9) {
                System.out.println("The candidate is eligible for both election to the Duke and for Viscount.");
                return true;


            }
//        else if(age >= 25 && lengthOfCitizenship >= 7)
//        {
//            System.out.print();
//            return false;
//        }

            else {
                System.out.print("The candidate is eligible for election to the Duke but NOT eligible for Viscount.");
                return false;
            }
        }

        return false;
    }
}
