package com.example.javatest.RomanNumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    /*
    I -> 1
    v -> 5
    X -> 10
    L -> 50
    C -> 100
    D -> 500
    M -> 1000
    I, X, C, M  Pueden repetirse 3 veces por numero
    V, L, D Solo pueden aparecer una vez por numero
    Si un número romano compuesto tiene un número a la derecha mayor que el de la izquierda y
    éste es un I, X o C, entonces se resta el de la izquierda al derecha.
     */

    @Test
    public void numbers_from_unids()
    {
        assertEquals("",RomanNumerals.arabicToRoman(0));
        assertEquals("I",RomanNumerals.arabicToRoman(1));
        assertEquals("II",RomanNumerals.arabicToRoman(2));
        assertEquals("III",RomanNumerals.arabicToRoman(3));
        assertEquals("IV",RomanNumerals.arabicToRoman(4));
        assertEquals("V",RomanNumerals.arabicToRoman(5));
        assertEquals("VI",RomanNumerals.arabicToRoman(6));
        assertEquals("VII",RomanNumerals.arabicToRoman(7));
        assertEquals("VIII",RomanNumerals.arabicToRoman(8));
        assertEquals("IX",RomanNumerals.arabicToRoman(9));
    }

    @Test
    public void numbers_from_tens()
    {
        assertEquals("X",RomanNumerals.arabicToRoman(10));
        assertEquals("XX",RomanNumerals.arabicToRoman(20));
        assertEquals("XXX",RomanNumerals.arabicToRoman(30));
        assertEquals("XL",RomanNumerals.arabicToRoman(40));
        assertEquals("L",RomanNumerals.arabicToRoman(50));
        assertEquals("LX",RomanNumerals.arabicToRoman(60));
        assertEquals("LXX",RomanNumerals.arabicToRoman(70));
        assertEquals("LXXX",RomanNumerals.arabicToRoman(80));
        assertEquals("XC",RomanNumerals.arabicToRoman(90));
    }

    @Test
    public void numbers_from_hundreds()
    {
        assertEquals("C",RomanNumerals.arabicToRoman(100));
        assertEquals("CC",RomanNumerals.arabicToRoman(200));
        assertEquals("CCC",RomanNumerals.arabicToRoman(300));
        assertEquals("CD",RomanNumerals.arabicToRoman(400));
        assertEquals("D",RomanNumerals.arabicToRoman(500));
        assertEquals("DC",RomanNumerals.arabicToRoman(600));
        assertEquals("DCC",RomanNumerals.arabicToRoman(700));
        assertEquals("DCCC",RomanNumerals.arabicToRoman(800));
        assertEquals("CM",RomanNumerals.arabicToRoman(900));
    }

    @Test
    public void numbers_from_thousand_units()
    {
        assertEquals("M",RomanNumerals.arabicToRoman(1000));
        assertEquals("MM",RomanNumerals.arabicToRoman(2000));
        assertEquals("MMM",RomanNumerals.arabicToRoman(3000));
        assertEquals("MMMCMXCIX",RomanNumerals.arabicToRoman(3999));
    }

}