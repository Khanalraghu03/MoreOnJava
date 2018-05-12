package FinalExamReview;
import java.util.Scanner;
public class Undefined {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter grades: ");
        int grades = input.nextInt();
        int sum = 0;
        int i = 0;
        while(grades != -1){
            System.out.println(grades);
            sum += grades;
            System.out.println("The sum is: " + sum);
            System.out.println("Type another or type -1 to compute the average: ");
            grades = input.nextInt();
            i++;
        }
        int average = sum/i;
        System.out.println(average);
    }
}
