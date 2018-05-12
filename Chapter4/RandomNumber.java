public class RandomNumber
{
    public static void main(String[] args)
    {
        int you = (int) (1 + Math.random()*7);
        int computer = (int) (1 + Math.random()*7);

        System.out.println("If the differences between you and the computer is odd, you lose.");
        System.out.println("If the differences between you and the computer is even, you win.");
        System.out.println("If the differences between you and the computer is zero, you tie.");

        System.out.println("This is your number: " + you);
        System.out.println("This is computer's number: " + computer);

        int differences = (Math.abs(you - computer));
        System.out.println("The differences is: " + differences);

        if (differences == 0)
        {
            System.out.println("A tie!");
        }
        else if(differences == 1 || differences == 3 || differences == 5 )
        {
            System.out.println("You lose!");
        }
        else
        {
            System.out.println("You Win!!");
        }
    }
}
