//package MyProgrammingLab;
//
//
//import java.util.*;
//public class Project6One
//{
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String userString = input.nextLine();
//
//        System.out.print("Enter a character: ");
//        String userCharacter = input.next();
//
//
//        int theOccurance = Project6One.counter(userString, userCharacter);
//
//        System.out.println(userCharacter+ " occurs " + theOccurance + " in the string");
//    }
//
//    public static int counter(String userString, char userCharacter)
//    {
//        int count = 0;
//        for (int i = 0; i < userString.length(); i++)
//        {
//            if (userString.charAt(i) == userCharacter)
//            {
//                count++;
//            }
//        }
//        return count;
//    }
//
//}