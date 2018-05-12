public class Hi573e {
    public static void main(String[] arg) {
        //print randNumber from 1- 50
        //if % 5 then sysout High 5
        // else if % 2 high 2
        // else % 3 or % 7 syout high

        int randNumber = (int) (Math.random() * 50 + 1);

        System.out.println(randNumber);

        if (randNumber % 5 == 0) {
            System.out.println("HiFive");
        }
        else if(randNumber % 2== 0)
        {
            System.out.println("HiTwo");
        }
        else if (randNumber % 3 == 0 || randNumber % 7 == 0)
        {
            System.out.println("HiThreeOrSeven");
        }

    }
}
