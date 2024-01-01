package org.example;

public class BeginStringFilter {
    private String pattern;

    public BeginStringFilter(String pattern){
        this.pattern=pattern;
    }
    public boolean apply(String str){
        return str.startsWith(pattern);
    }

}
