package Chapter7;

public class LockerPuzzle
{
    public static void main(String[] args)
    {
        // Declare a constant value for the number of lockers
        final int NUMBER_OF_LOCKER = 100;

        // Create an array to store the status of each array
        // The first student closed all lockers, each lockers[i] is false
        boolean[] lockers = new boolean[NUMBER_OF_LOCKER];

/**
 * In this distinct line of code, we have the variable that is of type boolean array, named 'lockers'
 * The [] indicates that we are tapping into the class Array.  *
 * The rules for declaring an array state that we declare the datatype followed by [], the name of the variable, then keyword new,
 * the data-type of the variable again.
 * If you choose to give a maximum or state the length or capacity of the array (list), as in this case,
 * within the brackets you would state the max capacity of your list. So the number within. This can also be left blank.
 * Here we give it the value of the constant NUMBER_OF_LOCKER, which is 100.
 * Remember we always terminate our statements with a ;
 * */


        int j = 1;
        while (j <= NUMBER_OF_LOCKER) //while this is less than or equal to 100.
        {
            int i = j - 1; //i will always be 1 number behind j. So here it represents 0.
            while (i < NUMBER_OF_LOCKER) //while i is less than 100 not inclusive
            {
                lockers[i] = !lockers[i]; // run through the list lockers index by index and negate its value. (if it is close open it and vice versa)
                i = i + j; //then change the value of i to i + j
            }
            j++; //increment j by one
        }

        // Find which one is open
        int i = 0; //goes through the index of the list lockers.
        while (i < NUMBER_OF_LOCKER)
        {
            if (lockers[i])
            {
                System.out.println("Locker " + (i + 1) + " is open");
            }
            i++;
        }

    }
}
