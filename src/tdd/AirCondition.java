package tdd;

public class AirCondition {
    private String turnOn;
    private String turnOff;


    public void off() {
        turnOff = "off";
    }
    public String getAC(){
        return turnOff;
    }
    public String getAC2(){
        return turnOn;
    }

    public void turnOn() {
        this.turnOn = "on";
    }

}


