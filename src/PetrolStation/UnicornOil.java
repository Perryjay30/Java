package PetrolStation;

public class UnicornOil {
    private int litrePurchased;
    private final double pricePerLitre = 200.00;
    private double percentageDiscount;
    private  double totalCharges;

    public void setQuantityPurchased(int litrePurchased){

        this.litrePurchased = litrePurchased;
    }
    public double getPercentageDiscount(){
        double percentageDiscount = (pricePerLitre * litrePurchased) * (0.02);
        this.percentageDiscount = percentageDiscount;
        return percentageDiscount;
    }

    public double getTotalCharges(){
        totalCharges = (pricePerLitre * litrePurchased) - percentageDiscount;
        return totalCharges;
    }
}
