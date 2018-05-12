package Chapter4;

public class StringPractice {
    public static void main(String[] args)
    {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";



    }

    public String getSecondLine(String a)
    {
        //after first index
        //after first index + after first index
        //length of aString, after first index


        return 	a.substring(a.indexOf("\n") + 1,
                a.indexOf("\n") + 1 + a.substring(a.indexOf("\n") + 1,
                        a.length()).indexOf("\n"));

    }

}
