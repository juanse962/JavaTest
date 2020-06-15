package com.example.javatest.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void when_is_divisible_by_three()
    {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.getNumber(3),"Fizz");
    }
    @Test
    public void when_is_divisible_by_five()
    {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.getNumber(5),"Buzz");
    }
    @Test
    public void when_is_divisible_by_both()
    {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.getNumber(15),"FizzBuzz");
    }
}