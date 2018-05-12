package Midterm;

/*
Write a program called Presidents.java that prompts the user to enter a year (4 digits).
The program should display the full name and state of the president that
held office on that year based on the table shown.
If the president of the year entered is not listed on the table,
the program should display the message "President cannot be determined".
*/

import java.util.Scanner;
public class Presidents {
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        while (year < 1981 || year > 2020)
        {
            System.out.println("President cannot be determined.");
            System.out.println("Enter a year between 1981 - 2020: ");
            year = input.nextInt();
        }
        String p1 = "Ronald Regan";
        String y1 = "1981 - 1989";
        String s1 = "California";

        String p2 = "George H.W. Bush";
        String y2 = "1990 - 1993";
        String s2 = "Texas";

        String p3 = "Bill Clinton";
        String y3 = "1994 - 2000";
        String s3 = "Arkansas";

        String p4 = "George W. Bush";
        String y4 = "2001 - 2009";
        String s4 = "Texas";

        String p5 = "Barack Obama";
        String y5 = "2010 - 2016";
        String s5 = "Illinois";





        String president = "President";
        String state = "State";
        String year1 = "Year";
        String space = " ";
        System.out.printf("%16s%16s%16s\n", president, year1, state);
        System.out.printf("%3s", space);
        horizLine();



        int presidents = 0;
        switch (presidents)
        {
            case 0: {
                if (year >= 1981 && year <= 1989){
                    System.out.printf("%16s%20s%16s",p1,y1,s1);
                    break;
                }
                else if(year >= 1990 && year <= 1993) {
                    System.out.printf("%20s%16s%13s",p2,y2,s2);
                    break;
                }

                else if (year >= 1994 && year <= 2000) {
                    System.out.printf("%16s%20s%16s",p3,y3,s3);
                    break;
                }

                else if (year >= 2001 && year <= 2009) {
                    System.out.printf("%18s%17s%13s",p4,y4,s4);
                    break;
                }
                else if (year >= 2010 && year <= 2012) {
                    System.out.printf("%16s%20s%14s",p5,y5,s5);
                    break;
                }
            }

            default: {
                System.out.println("President cannot be determined");
                break;
            }
        }
    }
    //variable ROW_Char = -
    public static final char ROW_CHAR = '-';

    //Width = 14
    public static final int WIDTH = 50;

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
