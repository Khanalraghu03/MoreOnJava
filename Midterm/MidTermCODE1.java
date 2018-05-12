package Midterm;

 /*  Write a Java program called CurExchangeYourname.java

        The program should display a conversion table from US dollars (USD) to Euro (EUR).
            To accomplish that, it should prompt the user for the highest USD amount, the increment and the exchange rate.
            It should then display the conversion table by using a loop starting from the increment to the highest amount
        and calling a method convertAmount,
        which receives the USD amount and the exchange rate and returns the EUR amount. A sample run is shown.*/
import java.util.Scanner;
public class MidTermCODE1 {
    public static void main(String[] agrs)
    {
        //Convert from US to EUR
        Scanner scan = new Scanner(System.in);

        System.out.print("Highest amount for dollars: ");
        int dollar = scan.nextInt();

        System.out.print("Increment: ");
        double incrementBy = scan.nextInt();

        System.out.println("Enter exchange rate to Euro: ");
        double exchangeRate = scan.nextDouble();

        String USD = "USD";
        String EUR = "EUR";
        String space = " ";
        System.out.printf("%8s%8s\n", USD, EUR);
        System.out.printf("%1s", space);
        horizLine();

        for(double i = incrementBy; i <= dollar; i = i + incrementBy)
        {
            double theEURO = i * exchangeRate;
            System.out.printf("%8.2f%8.2f\n", i, theEURO);
        }

    }

    //variable ROW_Char = -
    public static final char ROW_CHAR = '-';

    //Width = 14
    public static final int WIDTH = 14;

    /**
     * This method will print a single space character
     */
    //method called space w/ no parameter
    public static void space() {
        //' ' = a space
        System.out.print(' ');
    }


    public static void horizLine()
    {
        space();
        for (int i = 1; i <= WIDTH; i++) {
            System.out.print(ROW_CHAR);
        }
        System.out.println();
    }
}
