package Chapter6;
import java.util.Scanner;
public class PowersOfTwo {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter a number to run power of 2: ");
       int power = input.nextInt();

        while (power < 0 || power > 62)
        {
            System.out.println("Please enter a number between 0 and 62: ");
            power = input.nextInt();
        }

       printPowersOf2(2, power);
    }

   /* public static void printPowersOf2(int base, int power) {
//        int number = power;
//        int thepowers = 0;
        //2^0 = 1 * (zero 2s)
        //2^1 = 1 * (2)

        int i = 0;
        while ( i <= power)
        {

            int powers = base * i;
                System.out.printf("%5d\n", powers);
                i++;

        }*/




   public static void printPowersOf2(int base, int power) {
       System.out.println("1");
       int ans = 1;
       if (power != 0) {
           int absExponent = power > 0 ? power : (-1) * power;
           for (int i = 0; i <= 3; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 4; i <= 4; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 5; i <= 8; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 9; i <= 9; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 10; i <= 13; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 14; i <= 14; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 15; i <= 18; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 19; i <= 19; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 20; i <= 23; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }

           for (int i = 24; i <= 24; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 25; i <= 28; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 29; i <= 29; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 30; i <= 33; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 34; i <= 34; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 35; i <= 38; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 39; i <= 39; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 40; i <= 43; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 44; i <= 44; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 45; i <= 48; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 49; i <= 49; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 50; i <= 53; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 54; i <= 54; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 55; i <= 58; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }
           for (int i = 59; i <= 59; i++) {
               ans *= base;
               System.out.printf("%-16d\n", ans);

           }
           for (int i = 60; i <= 63; i++) {
               ans *= base;
               System.out.printf("%-16d", ans);

           }

       }
   }
}
