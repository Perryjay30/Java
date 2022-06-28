package bike;

public class Bike {

    public String isOn(String isOn) throws Exception {
        if(isOn == "isOn"){
        System.out.print("Bike is on");
    }
    else{
        throw new Exception("Turn on Bike");
    }
        return isOn;
    }

    public String isOff(String isOff)throws Exception {
        if(isOff == "isOff") {
            System.out.print("Bike is off");
        }
        else{
            throw new Exception("Turn off Bike");
        }
        return isOff;
    }

    public int accelerateGearOne(int gear, int speedLimit) throws Exception {
        if (gear == 1){
            System.out.println("Hello you are on gear one ");
        }
        else{
            throw new Exception("Not on gear 1");
        }

        if (speedLimit >= 0 && speedLimit <= 20){
            speedLimit++;
        }
        if (speedLimit > 20 || speedLimit < 0){
            throw new Exception("INVALID LIMIT");        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
    }

    public int accelerateGearTwo(int gear, int speedLimit) throws Exception {
        if (gear == 2) {
            System.out.println("Hello you are on gear two");
        } else {
            throw new Exception("Not on gear 2");
        }

        if (speedLimit >= 21 && speedLimit <= 30) {
            speedLimit +=2;
        }
        if (speedLimit > 30 || speedLimit < 21) {
            throw new Exception("INVALID LIMIT");
        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
    }



    public int accelerateGearThree(int gear, int speedLimit) throws Exception {
        if (gear == 3) {
            System.out.println("Hello you are on gear three");
        } else {
            throw new Exception("Not on gear 3");
        }

        if (speedLimit >= 31 && speedLimit <= 40) {
            speedLimit += 3;
        }
        if (speedLimit > 40 || speedLimit < 31) {
            throw new Exception("INVALID LIMIT");
        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
    }



    public int accelerateGearFour(int gear, int speedLimit) throws Exception {
        if (gear == 4) {
            System.out.println("Hello you are on gear four");
        } else {
            throw new Exception("Not on gear 4");
        }

        if (speedLimit >= 41 && speedLimit <= 50) {
            speedLimit += 4;
        }
        if (speedLimit > 50 || speedLimit < 41) {
            throw new Exception("INVALID LIMIT");
        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
        }


    public int decelerateGearOne(int gear, int speedLimit) throws Exception {
        if (gear == 1) {
            System.out.println("Hello you are on gear one");
        } else {
            throw new Exception("Not on gear 1");
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit -= 1;
        }
        if (speedLimit > 20 || speedLimit < 1) {
            throw new Exception("INVALID LIMIT");
        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
        }

    public int decelerateGearTwo(int gear, int speedLimit) throws Exception {
        if (gear == 2) {
            System.out.println("Hello you are on gear Two");
        } else {
            throw new Exception("Not on gear 2");
        }

        if (speedLimit >= 21 && speedLimit <= 30) {
            speedLimit -= 2;
        }
        if (speedLimit > 30 || speedLimit < 21) {
            throw new Exception("INVALID LIMIT");
        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
        }

    public int decelerateGearThree(int gear, int speedLimit) throws Exception {
        if (gear == 3) {
            System.out.println("Hello you are on gear Three");
        } else {
            throw new Exception("Not on gear 3");
        }

        if (speedLimit >= 31 && speedLimit <= 40) {
            speedLimit -= 3;
        }
        if (speedLimit > 40 || speedLimit < 31) {
            throw new Exception("Please, Enter the correct limit");
        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
        }

    public int decelerateGearFour(int gear, int speedLimit) throws Exception {
        if (gear == 4) {
            System.out.println("Hello you are on gear Four");
        } else {
            throw new Exception("Not on gear 4");
        }

        if (speedLimit >= 41 && speedLimit <= 50) {
            speedLimit -= 4;
        }
        if (speedLimit > 50 || speedLimit < 41) {
            throw new Exception("Please, Enter the correct limit");
        }

//        else {
//            throw new Exception("Gear limit is invalid");
//        }
        return speedLimit;
        }
    }

