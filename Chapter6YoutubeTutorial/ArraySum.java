package Chapter6YoutubeTutorial;

public class ArraySum {
    public static void main(String args[])
    {
        int raghu[] = {3,10,5,7,6,4};
        int sum = 0;

        for (int counter = 0; counter < raghu.length;counter++) {
            sum += raghu[counter];
        }
        System.out.println("The sum of the array is " +sum);
    }
}
