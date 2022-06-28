package ac;

import com.sun.security.jgss.GSSUtil;

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
            } else {
                throw new Exception("Kindly turn off properly");

            }

            return off;
        }

        public int increaseTemp(int temp) throws Exception {
        if (temp > 30){
           // throw new Exception("invalid temp.");
            temp = 30;
        }
        else {
            System.out.println("Temperature has increased to: " + temp);
        }
        return temp;

        }

    public int decreaseTemp(int temp) throws Exception {
        if (temp < 16){
            //throw new Exception("invalid temp.");
            temp = 16;
        }
        else {
            System.out.println("Temperature has decreased to: " + temp);
        }
        return temp;

    }


//    public int fixedGearNumber(){
//        return 0;
//    }

}


