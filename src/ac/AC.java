package ac;

import java.util.Objects;

public class AC {

    public String isOn(String on) throws Exception {
        if (Objects.equals(on, "on")) {
            System.out.println("Ac is on");
        } else {
            throw new Exception("PLease on ac properly.");

        }
        return on;

    }

        public String isOff(String off) throws Exception {
            if (Objects.equals(off, "off")) {
                System.out.println("Ac is off");
            }

            return off;
        }

        public int increaseTemp(int temp) throws Exception {
        if (temp > 30){
            throw new Exception("invalid temp.");
        }
        else {
            System.out.println("Temperature has increased to: " + temp);
        }
        return temp;

        }

    public int decreaseTemp(int temp) throws Exception {
        if (temp < 16){
            throw new Exception("invalid temp.");
        }
        else {
            System.out.println("Temperature has decreased to: " + temp);
        }
        return temp;

    }
}


