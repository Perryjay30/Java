package vehicle;

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
}
