package com.example.javatest.RomanNumerals;

public class RomanNumerals {
    public static String arabicToRoman(int n)
    {
        String romanNumber = "";
        romanNumber += unidadesDeMil(n);
        romanNumber += centenas(n);
        romanNumber += decenas(n);
        romanNumber += unidades(n);

        return romanNumber;
    }

    public static String unidadesDeMil(int n)
    {
        String romanNumber = "";
        n = n % 10000;
        n = n / 1000;
        if (n < 4) {
            for (int i = 0; i < n; i++) {
                romanNumber += "M";
            }
        }
        return romanNumber;
    }

    public static String centenas(int n)
    {

        String romanNumber = "";
        n = n % 1000;
        n = n / 100;

        String Sym1 = "C";
        String Sym2 = "D";
        String Sym3 = "M";
        romanNumber = cicloSyms(n, Sym1, Sym2, Sym3);
        return romanNumber;
    }

    public static String unidades(int n)
    {
        String romanNumber = "";
        n = n % 10;
        String Sym1 = "I";
        String Sym2 = "V";
        String Sym3 = "X";

        romanNumber = cicloSyms(n, Sym1, Sym2, Sym3);

        return romanNumber;
    }

    public static String decenas(int n)
    {
        String romanNumber = "";
        n = n % 100;
        n = n / 10;

        String Sym1 = "X";
        String Sym2 = "L";
        String Sym3 = "C";
        romanNumber = cicloSyms(n, Sym1, Sym2, Sym3);
        return romanNumber;
    }

    public static String cicloSyms(int n, String Sym1, String Sym2, String Sym3)
    {
        String romanNumber = "";

        if (n < 4) {
            for (int i = 0; i < n; i++) {
                romanNumber += Sym1;
            }

        }
        if (n >= 5 && n < 9) {
            romanNumber += Sym2;
            for (int i = 5; i < n; i++) {
                romanNumber += Sym1;
            }
        }
        if (n == 4) {
            romanNumber += Sym1 + Sym2;
        }
        if (n == 9) {
            romanNumber += Sym1 + Sym3;
        }
        return romanNumber;
    }
}
