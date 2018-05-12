package Chapter7Listings;

import java.util.Scanner;
public class Renz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter class size and their scores: ");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.println("What are the grades: ");
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        System.out.println("The scores of ITEC 2140");
        for(int i = 0;i < list.length;i++) {
            System.out.print(list[i] + " ");
            input.close();}

        int temp = list[0];
        for(int x = 1; x < list.length; x++)
        {if(temp < list[x])
        {temp = list[x];}}

        System.out.println("\nThe Higest score is: " + temp);

        int i,y,z;
        y = 0;
        for(i = 0; i <list.length; i++){y += list[i];}
        z =  y / list.length;
        System.out.println("The Average is: " + z);

        System.out.println("The Difference is: " + (temp - z));

    }
}
