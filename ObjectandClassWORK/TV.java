package ObjectandClassWORK;


public class TV {

    int channel = 1;
    int volume = 0;
    boolean power = false; //power is off

    public TV()
    {
        //no-arg constructor
    }

    //constructor with three parameters
    public TV(int channel, int volume, boolean power)
    {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }
    //constructor with two  parameters
    public TV(int channel, int volume)
    {
        this.channel = channel;
        this.volume = volume;
    }

    //access channel number
    public int getChannel() {
        return channel;
    }

    //change the channel number
    public void setChannel(int channel) {
        this.channel = channel;
    }

    //access the volume level
    public int getVolume() {
        return volume;
    }

    //change the volume level
    public void setVolume(int volume) {
        this.volume = volume;
    }

    //power on or off status
    public boolean isPower() {
        return power;
    }

    //to turn on/off TV
    public void setPower(boolean power) {
        this.power = power;
    }








}

