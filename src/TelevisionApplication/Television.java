package TelevisionApplication;

public class Television {

    private boolean switchOn;
    private int channel;

    private int volume;

    public boolean switchOn() {
        return switchOn;
    }

    public void turnOn() {
       switchOn = true;
    }

    public void turnOff() {
        switchOn = false;
        volume = 0;
        channel = 0;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public void increaseVolume() throws Exception {
        if(switchOn && volume < 100)
            volume++;
        else if (switchOn && volume > 100) {
            volume = 100;
            throw new TelevisionException("Volume cant exceed 100");
        }
    }

    public void decreaseVolume()  {
        if(switchOn && volume > 0)
            volume--;
        else if (switchOn && volume < 0) {
            volume = 0;
            throw new TelevisionException("Volume cant go below 0");
        }
    }

    public void changeChannelForward() {
        if(switchOn)
            channel++;
    }

    public void changeChannelBackward() {
        if(switchOn)
            channel--;
    }
}
