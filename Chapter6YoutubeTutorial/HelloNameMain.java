package Chapter6YoutubeTutorial;
import java.util.Scanner;
public class HelloNameMain {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        HelloName getHello = new HelloName();

        System.out.println("Please enter your name:");
        String name = input.nextLine();

        getHello.simpleMessage(name);
    }
}
