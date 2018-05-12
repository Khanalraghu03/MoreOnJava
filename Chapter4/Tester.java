//public class Tester
//{
//
//    public static void main(String[] args)
//    {
//
//        //num is 12345
//    	String num = "12345";
//
//    	// if the first character storage is < 1 bits {this if else is really unnessarry, OK will never be execute}
//        if(num.charAt(0) < 1)
//             System.out.println("OK"); //Print out OK
//         else if(num.charAt(0) > 49) //Grater than 1 bits
//             System.out.println("Hmmm."); //Print out Hmmm.
//
//
//        if(num.charAt(0) > '1') // if the first character is < 1
//            System.out.println("Uh-oh"); //Print out Uh-oh
//        else if(num.charAt(0) == '1') //The first # is = first character
//            System.out.println("Riddles?"); //Print out Riddles?
//        else //Grater than 1
//            System.out.println("Well..."); //Print out Well...
//
//
//        //The program prints Hmmm.
//        	//> 0 && < 49 = Hmm will execute
//        	//Without '', it considers it as bits
//        	// one character is 8 bits, never negative nor 0.
//        	//Total bits here is 5 * 8 = 40 + (9 for placeholders etc...)
//
//
//        //The program prints Riddles? because the first character is equal to 1 AND meets the expression
//        	// else if(num.charAt(0) == '1')
//        	// System.out.println("Riddles?");
//
//        System.out.println("What is the difference between '1' and 1?");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//    	char alp1 = 'a';
//		char alp2 = 'A';
//		char num1 = '0';
//		char num2 = '1';
//
//		int alp3 = 'a';   //  you can type as  int alp3 = (int)(�3�);
//		int alp4 = 'A';
//		int num3 = '0';
//		int num4 = '1';
//		int num5 = 1;
//
//
//		System.out.println("alp1 is: " + alp1);
//		System.out.println("alp2 is: " + alp2);
//		System.out.println("num1 is: " + num1);
//		System.out.println("num2 is: " + num2);
//
//		System.out.println("What is the decimal integer number of following characters? ");
//		System.out.println("alp3 is: " + alp3);
//		System.out.println("alp4 is: " + alp4);
//		System.out.println("num3 is: " + num3);
//		System.out.println("num4 is: " + num4);
//		System.out.println("num5 is: " + num5);
//
//		System.out.println("Is the (character) '1' larger than decimal (integer) 1?" );
//		System.out.println("The answer is: "  + (num4 > 1));
//    }
//}