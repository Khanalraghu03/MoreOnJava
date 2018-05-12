package Chapter5;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        int i;

        boolean isPrime = true;

        for (i = 2; i < number && isPrime; i++) {

            if (number % i == 0) {

                isPrime = false;

            }

        }

        System.out.println("i is " + i);

        if (isPrime)

            System.out.println(number + " is prime");

        else

            System.out.println(number + " is not prime");

    }

}