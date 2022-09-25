package Tdd_Wahala;

public class AirConditioner {

    private boolean isSwitchedOn;
    private boolean isSwitchedOff;

    public int getTemperature() {
        return temperature;
    }

    private int temperature = 16;
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    public boolean isSwitchedOff() {
        return isSwitchedOff;
    }

    public void turnOn() {
        isSwitchedOn = true;
    }

    public void turnOff() {
        isSwitchedOff = true;
    }

    public int defaultTemperature() {
        if(isSwitchedOn)
            temperature = 16;
        else
            temperature = 0;

        return temperature;
    }

    public int increaseTemperature() throws Exception {
        if (isSwitchedOff())
            temperature = 0;
        else if(isSwitchedOn() && temperature >= 16 && temperature < 30) {
            temperature += 1;
        }
        else {
            throw new Exception("Invalid Limit");

        }
        return temperature;
    }

    public int decreaseTemperature() throws Exception {
        if (isSwitchedOff())
            temperature = 0;
        else if(isSwitchedOn()) {
            temperature--;
        }
        else if(temperature < 16)
            throw new Exception("Cant go below 16");

        return temperature;

    }
}
