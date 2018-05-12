package Chapter6YoutubeTutorial;
import java.util.Random;
public class ArrayElementAsCounters {
    public static void main(String[] args)
    {
        Random theRandNumber = new Random();
        int freq[] = new int[7];

        for (int roll = 1; roll < 1000; roll++) {
            ++freq[1+ theRandNumber.nextInt(6)];
        }
        System.out.println("Face\tFrequency");

        for (int face = 1; face<freq.length;face++) {
            System.out.println(face+"\t"+freq[face]);
        }
    }
}
