package org.example;

public class PackageWeightProduct {
    private PackingProduct packing;
    private Weightproduct product;
    private double weight;
    public PackageWeightProduct(PackingProduct packing, Weightproduct product, double weight){
        this.packing=packing;
        this.product=product;
        this.weight=weight;
    }
    public double GetNettoMassa(){
        return weight;
    }
    public double GetBruttoMass(){
        return weight+packing.getWeight();
    }
    public String GetName(){
        return product.getProductName();
    }
}
