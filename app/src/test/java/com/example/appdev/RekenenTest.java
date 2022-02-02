package com.example.appdev;

import static org.junit.Assert.*;

import org.junit.Test;

public class RekenenTest {

    /*@Test
    public void getGetal1() {
    }

    @Test
    public void setGetal1() {
    }

    @Test
    public void getGetal2() {
    }

    @Test
    public void setGetal2() {
    }

    @Test
    public void getResultaat() {
    }

    @Test
    public void setResultaat() {
    }
*/
    @Test
    public void opTellen() {

        int test1 = 1;
        int test2 = 2;
        int verwacht = 3;

        Rekenen reken = new Rekenen(  );
        reken.setGetal1(test1);
        reken.setGetal2(test2);
        int resultaat = reken.opTellen(reken.getGetal1( ), reken.getGetal2( ));
        assertEquals(resultaat, verwacht);

    }
}