package Chapter6YoutubeTutorial;

public class ArraysINmethods {
    public static void main(String args[]) {
        int raghu[] = {3,4,5,6,7};
        changeinArray(raghu);

        for (int y:raghu)
        System.out.println("\t" +y);
    }
    public static void changeinArray(int x[]) {
        for (int counter =0; counter < x.length; counter++) {
            x[counter] += 5;
        }
    }
}
