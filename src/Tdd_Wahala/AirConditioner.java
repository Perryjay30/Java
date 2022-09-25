package Tdd_Wahala;

public class AirConditioner {

    private boolean isSwitchOn;

    public int getTemperature() {
        return temperature;
    }

    private int temperature = 16;
    public boolean isSwitchOn() {
        return isSwitchOn;
    }

    public void turnOn() {
        isSwitchOn = true;
    }

    public void turnOff() {
        isSwitchOn = false;
        temperature = 0;
    }

    public int defaultTemperature() {
        if(isSwitchOn)
            temperature = 16;
        else
            turnOff();

        return temperature;
    }

    public void increaseTemperature() throws Exception {
        if(isSwitchOn && temperature >= 16 && temperature < 30) {
            temperature += 1;
        }
        else if(isSwitchOn && temperature > 30) {
            temperature = 30;
            throw new Exception("The highest temperature is 30");
        }
    }

    public void decreaseTemperature() throws Exception {
        if(isSwitchOn && temperature > 16) {
            temperature--;
        }
        else if(isSwitchOn && temperature < 16) {
            temperature = 16;
            throw new Exception("Cant go below 16");
        }
        else if (!isSwitchOn)
                System.out.println("Impossible");
    }
}
