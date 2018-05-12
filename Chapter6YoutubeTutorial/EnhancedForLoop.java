package Chapter6YoutubeTutorial;

public class EnhancedForLoop {
    public static void main(String args[]) {
        int raghu[] = {3,4,10,6,7};
        int total =0;

        //save the num in x
        for(int x: raghu){
            total += x;
        }
        System.out.println(total);
    }
}
