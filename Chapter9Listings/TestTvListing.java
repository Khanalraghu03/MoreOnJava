package Chapter9Listings;

public class TestTvListing{
    public static void main(String[] args) {
        //create Object called Tv1 (invoking class TvListing w/ first TV as an object)
        TvListing tv1 = new TvListing();
        //Turn it on
        tv1.turnOn();

        //Set the channel to 30
        tv1.setChannel(30);

        //Set the volume to 3
        tv1.setVolume(3);

        //For Second TV do this: (invoking class w/Tv2 as object)
        TvListing tv2 = new TvListing();
        //Turn it on
        tv2.turnOn();

        //Turn the channel up, so it's channel 2
        tv2.channelUp();
        //turn the channel up: so it;s 3
        tv2.channelUp();
        //Turn the volume up to 2
        tv2.volumeUp();


        //Print the current status of First and Second TV
        System.out.println("tv1's channel is " + tv1.channel
                + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel
                + " and volume level is " + tv2.volumeLevel);
    }
}

