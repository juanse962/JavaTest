package com.example.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

    @Test
    public void testRepeatOne() {
        Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }
    @Test
    public void testRepeatZero() {
        Assert.assertEquals("", StringUtil.repeat("Hola", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testStringNegativeTime(){
        StringUtil.repeat("Hola", -1);
    }

}