package org.example;

public class ShtukaProduct extends Product {
    private double weightShtuki;

    public ShtukaProduct(String productName, String productSpec, double weightShtuki){
        super(productName, productSpec);
        this.weightShtuki=weightShtuki;
    }

    public double getWeightShtuki() {
        return weightShtuki;
    }

    public void setWeightShtuki(double weightShtuki) {
        this.weightShtuki = weightShtuki;
    }
}
