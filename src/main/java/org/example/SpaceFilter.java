package org.example;

public class SpaceFilter {
    public boolean apply(String str){
        return str.matches("\\s+");
    }

}
