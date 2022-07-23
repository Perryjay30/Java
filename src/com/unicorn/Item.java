package com.unicorn;

public class Item {
    private double valueSold;

    public Item() {}

    public Item(double value) {
        this.valueSold = value;
    }

    public double getValueSold() {
        return valueSold;
    }

    public void setValueSold(double valueSold) {
        this.valueSold = valueSold;
    }

}
