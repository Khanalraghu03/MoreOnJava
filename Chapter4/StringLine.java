package Chapter4;

import java.util.Scanner;
public class StringLine {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = input.next();
        String b = input.next();


        System.out.println("Your initial is " + a.toUpperCase().charAt(0) + b.toUpperCase().charAt(0));
    }
}
