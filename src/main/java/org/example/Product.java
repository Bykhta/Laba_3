package org.example;

public class Product {
    private String productName;
    private String productSpec;

    public Product(String productName, String productSpec){
        this.productName=productName;
        this.productSpec=productSpec;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }
}
