package org.example;

public class BeginSymbolFilter {
    private char pattern;
    public BeginSymbolFilter(char pattern){
        this.pattern=pattern;
    }
    public boolean apply(String str){
        return str.charAt(0)==pattern;
    }
}
