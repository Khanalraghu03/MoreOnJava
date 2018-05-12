package Chapter6;

public class ListingsTwoWithoutVOID
{
    //return a Character = char (instead of void)
    public static char getGrade(double score)
    {
        if (score >= 90.0)
            return 'A';
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
            return 'F';
    }


    public static void main(String[] args)
    {
        //getGrade = method from above
        //Use 78.5 and check the condition above
        //give me a char that meets the character's criteria through the grade number

        //78.5 is in the range of >= 70 so it prints C

        System.out.print("The grade is " + getGrade(78.5));
        System.out.print("\nThe grade is " + getGrade(59.5));
    }

}
