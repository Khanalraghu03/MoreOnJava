package Chapter7HW;
import java.util.Scanner;
public class TopScoreYourName {
    public static void main(String[] args)
    {
        //Scanner, to get inputs from users
        Scanner input = new Scanner(System.in);

        //ask user for 10 score
        System.out.print("Enter 10 score of ITEC 2140 class students: ");
        double[] scores = new double[10];

        //make sure users input 10 score
        double n = scores.length;
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextDouble();
        }

        //define the highestScore, average, and difference
        double highestScore = getMaxValue(scores);
        double average = (getSumValue(scores))/n;
        double difference = 100 - average;

        //print the highest score, average, and the difference.
        System.out.printf("Highest score = %.2f\t", highestScore);
        System.out.printf("Average = %.2f\t", average);
        System.out.printf("Difference = %.2f", difference);

    }

    //define maxValue
    public static double getMaxValue(double x[]) {
        double n = x.length;
        double max = x[0];
        //check from the arrays to get the maximum number
        for (int i = 1; i < n; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        return max;
    }

    //define getSumValue
    public static double getSumValue(double y[]) {
        double sum = 0;
        double n = y.length;
        for (int i = 0; i < n; i++) {
            sum += y[i];
        }
        return sum;
    }
}
