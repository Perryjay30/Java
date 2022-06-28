package vehicle;

import jdk.swing.interop.SwingInterOpUtils;

public class Motor {
    public String brand;
    public String setBrake;
    private int plateNumber;
    private String color;
    private String brake;

    public Motor() {
    }

    public int getPlateNumber(){
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber){
        this.plateNumber = plateNumber;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setBrake(String brake){
        this.brake = brake;
    }

    public String getBrake(){
        return brake;
    }

    public int gearOfCar(int gnum, int speedLimit) throws Exception {
        if (gnum == 1) {
            System.out.println("You are on gear one");
        } else {
            if (gnum == 2) {
                System.out.println("you are on gear Two");
            } else {
                if (gnum == 3) {
                    System.out.print("You are on gear Three");
                }

                if (speedLimit >= 0 && speedLimit <= 10) {
                    System.out.print("you are on gear one");
                }

                if (speedLimit >= 11 && speedLimit <= 20) {
                    System.out.print("you are on gear two");
                }

                if (speedLimit >= 21 && speedLimit <= 30) {
                    System.out.print("you are on gear three");
                }


            }

        }

        return speedLimit;
    }
}
