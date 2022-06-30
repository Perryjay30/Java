package tddClass2;

public class AutomaticBike {
    private boolean isOn;
    private boolean isOff;
    private int speed;
    private int gear;

    public AutomaticBike(boolean isOn, boolean isOff){
        this.isOn = isOn;
        this.isOff = isOff;
        this.speed = 10;
    }
    public void setBikeOn() {
        this.isOn = true;
    }
    public String getBikeOn(){
        String response = "";
        if (isOn){
            response = "It is on";
        }
        return response;
    }

    public void setBikeOff() {
        this.isOff = true;
    }

    public String getBikeOff() {
        String response = "";
        if(isOff) {
            response = "It is Off";
        }
        return response;
    }
    public void setGear(int gear){
        if (gear >=1 && gear <= 4)
            this.gear = gear;
    }
    public void accelerate(){
        if (isOn == true) {
            if (gear == 1)
                speed = speed + 1;
            if (gear == 2)
                speed = speed + 2;
            if (gear == 3)
                speed = speed + 3;
            if (gear == 4)
                speed = speed + 4;
        }


    }

    public void decelerate(){
        if(isOn == true) {
            if (gear == 1)
                speed = speed - 1;
            if (gear == 2)
                speed = speed - 2;
            if (gear == 3)
                speed = speed -3;
            if (gear == 4)
                speed = speed -4;
            }
    }
    public int getSpeed(){
        if (speed < 0)
            speed = 0;
        return speed;
    }

}
