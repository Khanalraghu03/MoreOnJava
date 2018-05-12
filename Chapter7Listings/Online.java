package Chapter7Listings;

import java.lang.*;
import java.util.Scanner;
public class Online {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //my_arr = 5
        int[] my_arr = new int[5];
        System.out.print("Please enter a string: ");
        String word = scan.nextLine();


        my_arr = vowelCount(word);


        System.out.print("a: "+my_arr[0]);
        System.out.print("\ne: "+my_arr[1]);
        System.out.print("\ni: "+my_arr[2]);
        System.out.print("\no: "+my_arr[3]);
        System.out.print("\nu: "+my_arr[4]);

    }

    public static int[] vowelCount(String str)
    {
        int[] v_count = new int[5];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                v_count[0]++;
            }
            else if(str.charAt(i)=='e')
            {
                v_count[1]++;
            }
            else if(str.charAt(i)=='i')
            {
                v_count[2]++;
            }
            else if(str.charAt(i)=='o')
            {
                v_count[3]++;
            }
            else if(str.charAt(i)=='u')
            {
                v_count[4]++;
            }
        }
        return v_count;
    }

}