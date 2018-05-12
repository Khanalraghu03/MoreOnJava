package ObjectandClassWORK;


public class TVTester {

    public static void main(String[] args) {

        TV tv1 = new TV();
        System.out.println(tv1.channel);
        tv1.setPower(true);
        System.out.println(tv1.isPower());


        BetterTV tv2 = new BetterTV();
        System.out.println(tv2.power);
        tv2.setPower(true);
        System.out.println(tv2.power);

        tv2.setPower(false);
        System.out.println(tv2.power);

        tv2.channelUp();
        System.out.println("Current Channel is " + tv2.getChannel());

        BestTV tv3 = new BestTV();
        System.out.println(tv3.power);

        //	tv3.setPower(false);
        //	System.out.println(tv3.power);

        tv3.channelUp();
        System.out.println("Current Channel is " + tv3.getChannel());

    }

}

