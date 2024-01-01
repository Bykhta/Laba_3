package org.example;

import java.util.ArrayList;

public class ProductPartia {
    private  String spec;
    private ArrayList<PackageWeightProduct> weightProducts;
    private ArrayList<PackageShtukaProduct> shtukaProducts;

    public ProductPartia(String spec, ArrayList<PackageWeightProduct> weightProducts, ArrayList<PackageShtukaProduct> shtukaProducts){
        this.spec=spec;
        this.weightProducts=weightProducts;
        this.shtukaProducts=shtukaProducts;
    }
    public double GetMasspartia(){
        double mass=0;
        for (int i = 0; i < weightProducts.size(); i++) {
            mass+=weightProducts.get(i).GetBruttoMass();
        }
        for (int i = 0; i < shtukaProducts.size(); i++) {
            mass+= shtukaProducts.get(i).GetBruttoMass();
        }
        return mass;
    }
}
