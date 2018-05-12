package Chapter4;

import java.util.Scanner;
public class Alpabatize2Cities {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
         System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.println("The differences of city1 and city2 is: " + city1.compareTo(city2));

         if (city1.compareTo(city2) < 0)
             System.out.println("The cities in alphabetical order are " +
                city1 + " " + city2);
         else
         System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
    }
}