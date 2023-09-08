package com.inte.app;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DavidsKlassTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        DavidsKlass k = new DavidsKlass();

        assertEquals( 0, k.getInt() );
    }

}
