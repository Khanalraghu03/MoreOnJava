package Chapter5;

import java.util.Scanner;
public class AverageGrades {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int avg;
        int counter = 0;

        System.out.print("Enter 10 grades: ");

        while (counter < 10) {
            grade = input.nextInt();

            total = total + grade;
            counter++;
        }
        avg = total /10;

        System.out.println("Your average is: " + avg);
    }
}
