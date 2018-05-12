package Chapter7Listings;
import java.util.Scanner;
public class AnalyzeNumbers {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++)
        {
            numbers[i] = input.nextDouble();
            sum = sum + numbers[i];
        }

        double avg = sum/n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > avg) {
                count++;
            }
        }
        System.out.println("Average is " +avg);
        System.out.println("Numbers of elements above the average is "+ count);
    }
}
