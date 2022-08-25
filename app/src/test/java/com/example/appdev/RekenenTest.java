package com.example.appdev;

import static org.junit.Assert.*;

import org.junit.Test;

public class RekenenTest {


    @Test
    public void opTellen() {

        int test1 = 1;
        int test2 = 2;
        int verwacht = 3;

        Rekenen reken = new Rekenen(  );
        reken.setGetal1(test1);
        reken.setGetal2(test2);
        int resultaat = reken.opTellen();
        assertEquals(resultaat, verwacht);

    }
}