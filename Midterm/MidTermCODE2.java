package Midterm;

import java.util.Scanner;
public class MidTermCODE2 {
    public static int theNums(char theUpperCaseLetter) {
        int num = 0;
        switch (theUpperCaseLetter) {
            case 'A':
            case 'B':
            case 'C':
                num = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                num = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                num = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                num = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                num = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                num = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                num = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                num = 9;
                break;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            char currentChar = string.charAt(i);

            if (Character.isLetter(currentChar)) {

                currentChar = Character.toUpperCase(currentChar);


                int theNum = theNums(currentChar);


                System.out.print(theNum);
            } else {

                System.out.print(currentChar);
            }
        }
        System.out.println();
    }
}

