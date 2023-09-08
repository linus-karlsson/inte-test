package com.inte.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {
    @Test
    public void addsCorrectly() {
        Counter c = new Counter(2);
        c.increaseNumber();
        int actual = c.getNumber();
        assertEquals(3, actual);
    }
}
