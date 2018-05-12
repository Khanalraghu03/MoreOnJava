package Chapter6YoutubeTutorial;
/*
* This program makes Header Index and Value
* Prints the counter that starts from zero as the index
* Prints the value given to the Value
* */

public class ArrayTable {
    public static void main(String args[])
    {
        //header
        System.out.println("Index\tValue");

        //array initializer
        int raghu[] = {1,5,7,2,5};

        //counter start 0, because first index of an array starts counting at zero
        for (int counter = 0; counter < raghu.length; counter++) {
            System.out.println(counter + "\t" + raghu[counter]);
        }
    }
}
