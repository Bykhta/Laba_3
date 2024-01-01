package org.example;

import java.util.Objects;

public class PackingProduct {
    private String name;
    private Double weight;
    public PackingProduct(String name, Double weight){
        this.name=name;
        this.weight=weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackingProduct that = (PackingProduct) o;
        return Objects.equals(name, that.name) && Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
