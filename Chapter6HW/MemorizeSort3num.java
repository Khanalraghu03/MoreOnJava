package Chapter6HW;

/**
 *
 * Chapter 6: Exercise 6.5 Sort Three Numbers
 * This program will display three numbers in increasing order.
 *
 *
 */
public class MemorizeSort3num {
    public static void main(String[] args) {
        // Prompt the user to enter three double values
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Enter three double numbers
        System.out.print("Enter three double values: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        // Invoke the displaySortedNumbers method to display the
        // numbers in increasing order
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double number1, double number2, double number3)
    {
        // Write the code to implement this method
        if (number1 > number2)
        {
            double temp = number1;
            number1 = number2;
            number2 = temp;
        }

        if (number2 > number3)
        {
            double temp = number2;
            number2 = number3;
            number3 = temp;
        }

        if (number1 > number2)
        {
            double temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("The sorted numbers are " + number1 + " " + number2 + " " + number3);
    }
}
