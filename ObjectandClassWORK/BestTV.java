package ObjectandClassWORK;


public class BestTV {

    int channel = 0;
    int volume = 0;
    boolean power = false; //power is off

    public BestTV()
    {
        //no-arg constructor
    }

    //constructor with three parameters
    public BestTV(int channel, int volume, boolean power)
    {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }
    //constructor with two  parameters
    public BestTV(int channel, int volume)
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

        if (!power)
            System.out.println("TV is off.");
        else if(power && channel >=1 && channel <= 120)
        {
            this.channel = channel;
        }

    }

    //access the volume level
    public int getVolume() {
        return volume;
    }

    //change the volume level
    public void setVolume(int volume) {

        if(!power)
            System.out.println("TV is off");

        else if(power && volume >= 0 && volume <= 30 )
        {
            this.volume = volume;
        }
    }

    //power on or off status
    public boolean isPower() {
        return power;
    }

    //to turn on/off TV
    public void setPower(boolean power) {

        this.power = power;
    }

    public void channelUp()
    {
        if(!power)
        {
            this.channel = 0;
            System.out.println("TV is Off.");
        }

        else if(power && channel <120)
            channel++;
    }

    public void channelDown()
    {
        if(!power)
        {
            this.channel = 0;
            System.out.println("TV is Off.");
        }

        else if(power && channel >1)
            channel--;
    }

    public void volumeUp()
    {
        if(!power)
        {
            this.channel = 0;
            System.out.println("TV is Off.");
        }
        else if(power && volume < 30)
            volume++;
    }

    public void volumeDown()
    {
        if(!power)
        {
            this.channel = 0;
            System.out.println("TV is Off.");
        }
        else if(power && volume > 1)
        {
            volume--;
        }
    }
}

