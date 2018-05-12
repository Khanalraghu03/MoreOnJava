package FinalExamReview;
import  java.util.Scanner;
public class Book
{
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] book = new String[10];

        for (int i = 0; i< 10; i++) {
            System.out.printf("Enter the title for book %4d", i +1);
            book[i] = input.nextLine();
        }
    }

}
