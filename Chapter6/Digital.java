package Chapter6;

public class Digital {
    //variable ROW_Char = *
    public static final char ROW_CHAR = '*';
    public static final char COL_CHAR = 'x';

    //Width = 9
    public static final int WIDTH = 9;
    public static final int HEIGHT = 3;
    public static final int NUM_BLANK = 4;

    /**
     * This method will print a single space character
     */
    //method called space w/ no parameter
    public static void space() {
        //' ' = a space
        System.out.print(' ');
    }

    /**
     * This method prints a horizontal line
     */
    public static void horizLine()
    {
        space();
        for (int i = 1; i <= WIDTH; i++) {
            System.out.print(ROW_CHAR);
        }
        System.out.println();
    }

    /**
     * This method will print left and right vertical lines
     */
    public static void leftRight() {
        for (int i = 1; i <= HEIGHT; i++) {
            System.out.print(COL_CHAR);
            for (int j = 1; j <= WIDTH; j++) {
                space();
            }
            System.out.println(COL_CHAR);
        }
    }

    /**
     * This prints a left-sided vertical line
     */
    public static void leftOnly()
    {
        for (int i = 1; i <= HEIGHT; i++) {
            System.out.println(COL_CHAR);
        }
    }

    /**
     * This prints a right-sided vertical line
     */
    public static void rightOnly() {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= WIDTH + 1; j++)  {
                space();
            }
            System.out.println(COL_CHAR);
        }
    }

    public static void blankLines() {
        for (int i = 1; i <= NUM_BLANK; i++) {
            System.out.println();
        }
    }

    public static void writeDigit0() {
        horizLine();
        leftRight();
        System.out.println();
        leftRight();
        horizLine();
    }

    public static void writeDigit1() {
        rightOnly();
        System.out.println();
        rightOnly();
    }

    public static void writeDigit2() {
        horizLine();
        rightOnly();
        horizLine();
        leftOnly();
        horizLine();
    }

    public static void writeDigit3() {
        horizLine();
        rightOnly();
        horizLine();
        rightOnly();
        horizLine();
    }

    public static void writeDigit4() {
        leftRight();
        horizLine();
        rightOnly();

    }

    public static void writeDigit5() {
        horizLine();
        leftOnly();
        horizLine();
        rightOnly();
        horizLine();

    }

    public static void writeDigit6() {
        horizLine();
        leftOnly();
        horizLine();
        leftRight();
        horizLine();
    }

    public static void writeDigit7() {
        horizLine();
        leftRight();
        rightOnly();
    }

    public static void writeDigit8() {
        horizLine();
        leftRight();
        horizLine();
        leftRight();
        horizLine();
    }

    public static void writeDigit9() {
        horizLine();
        leftRight();
        horizLine();
        rightOnly();
        horizLine();
    }

    public static void main(String [] args) {
        writeDigit0();
        blankLines();

        writeDigit1();
        blankLines();

        writeDigit2();
        blankLines();

        writeDigit3();
        blankLines();

        writeDigit4();
        blankLines();

        writeDigit5();
        blankLines();

        writeDigit6();
        blankLines();

        writeDigit7();
        blankLines();

        writeDigit8();
        blankLines();

        writeDigit9();
        blankLines();
    }
}
