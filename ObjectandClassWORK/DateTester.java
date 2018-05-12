package ObjectandClassWORK;

public class DateTester {
    public static void main(String[] agrs) {
        java.util.Date test = new java.util.Date();

        long n = 10000;
        for (int i = 0; i <8; i++){
            test.setTime(n);
            System.out.println(test.toString());
            n *= 10;
        }
    }
}
