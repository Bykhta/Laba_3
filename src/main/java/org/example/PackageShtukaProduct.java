package org.example;

public class PackageShtukaProduct {
     private PackingProduct packing;
     private ShtukaProduct product;
     private int count;
     public PackageShtukaProduct(PackingProduct packing, ShtukaProduct product, int count){
         this.packing=packing;
         this.product=product;
         this.count=count;
     }
     public int GetCount(){
         return count;
     }
     public double GetNettoMass(){
         return product.getWeightShtuki()*count;
     }
     public double GetBruttoMass(){
         return product.getWeightShtuki()*count+packing.getWeight();
     }
     public String GetName(){
         return product.getProductName();
     }
}
