package Chapter6;

public class ListingOne {
    public static int max(int num1, int num2) {

        int result;
        if(num1 >num2) {
            result = num1;
        }
        else {
            result =num2;
        }
        return result;
    }
    public static void main(String[] agrs) {
        int i = 5;
        int j = 9;
        int k = max(i,j);
        System.out.println("This is i "+i+", this is j "+ j+ ", this is the max " + k);
    }
}