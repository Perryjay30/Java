package airconditioner;

public class AirConditioner {

    public String isOn(String isOn) {
        System.out.print("the AC is on");
        return isOn;
    }
    public String isOff(String isOff) {
        System.out.print("the AC is off");
        return isOff;
    }

    public int increaseTemp(int temp) {
        System.out.print("the temperature has increase to:" + temp);
        return temp;

    }

    public int decreaseTemp(int temp) {
        System.out.print("the temperature has decrease to:" + temp);
        return temp;
    }

}
