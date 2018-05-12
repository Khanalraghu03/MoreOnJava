package Midterm;

/*
Write a program called CheckStringYourName.java that prompts the user to enter two strings
and reports whether the second string is a substring of the first. Here is a sample run:

        Enter string s1: ABCD

        Enter string s2: BC

        BC is a substring of ABCD
*/

import java.util.Scanner;
public class CheckStringYourName {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first string: ");
        String s1 = input.nextLine();

        System.out.print("Enter your second string: ");
        String s2 = input.nextLine();

        if (s1.indexOf(s2) == -1) {
            System.out.println(s2+" is a NOT substring of " + s1);
        }
        else {
            System.out.println(s2 + " is a substring of " + s1);
        }
    }
}
