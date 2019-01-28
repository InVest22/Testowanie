package com.Kalkulator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testy {

    @Test
    public void Test_1(){
        Dzialania d = new Dzialania();

        assertEquals(d.suma(0,0),0,0);
        assertEquals(d.suma(10,10),20,0);
    }

    @Test
    public void Test_2(){
        Dzialania d = new Dzialania();

        assertEquals(d.roznica(0,0),0,0);
        assertEquals(d.roznica(10,15),-5,0);
        assertEquals(d.roznica(2.5,3.5),-1.0,0);
    }

    @Test
    public void Test_3(){
        Dzialania d = new Dzialania();

        assertEquals(d.iloczyn(0,0),0,0);
        assertEquals(d.iloczyn(10,0),0,0);
        assertEquals(d.iloczyn(10,10),100,0);
    }

    @Test
    public void Test_4(){
        Dzialania d = new Dzialania();

        assertEquals(d.iloraz(10,10),1,0);
        assertEquals(d.iloraz(25,5),5,0);
        assertEquals(d.iloraz(10,4),2.5,0);
    }
}
