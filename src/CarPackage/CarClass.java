package CarPackage;

public class CarClass {

    private String mercedes;
    private String january2011;
    private double price = 200000.00;
    public double percentageDiscount;
    public double discountPrice;

    public CarClass(String mercedes, String january2011, double price) {
        this.mercedes = mercedes;
        this.january2011 = january2011;
        this.price = price;
    }

    public CarClass() {

    }

    public String setMercedes(String mercedes) {
        return mercedes;
    }
    public void getMercedes(){}

    public String setJanuary2011(String january2011) {
        return january2011;
    }
    public void january2011() {}

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setPercentageDiscount(){
        double percentageDiscount = (price/0.05);
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getDiscountPrice() {
        discountPrice = (price + percentageDiscount);
        return discountPrice;
    }

    public void setDiscountPrice() {
        this.discountPrice = discountPrice;
    }
}
