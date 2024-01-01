package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {
    @Test
    public void testFilter1(){
        String str="Mom is washed window";
        BeginStringFilter filter1=new BeginStringFilter("Mom");
        BeginStringFilter filter2=new BeginStringFilter("Washed");
        boolean res1=filter1.apply(str);
        boolean res2=filter2.apply(str);

        assertTrue(res1);
        assertFalse(res2);
    }
    @Test
    public void testFilter2(){
        String str="Иванов Иван Иваныч";
        BeginSymbolFilter filter1=new BeginSymbolFilter('И');
        BeginSymbolFilter filter2=new BeginSymbolFilter('B');
        boolean res1=filter1.apply(str);
        boolean res2=filter2.apply(str);

        assertTrue(res1);
        assertFalse(res2);
    }
    @Test

    public void testFilter3(){
        String str="sagdsgdssdf";
        String str1=" ";
        SpaceFilter filter1=new SpaceFilter();
        boolean res1=filter1.apply(str);
        boolean res2=filter1.apply(str1);

        assertFalse(res1);
        assertTrue(res2);

    }
}