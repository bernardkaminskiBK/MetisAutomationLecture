package java_spolocna_praca_s_lektorom.webinar14.Zadanie_14_2_3;

import java.util.Scanner;

public class GeneratorFibonaccihoPostupnostiTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadajte v poradi ktore cislo vo Fibonacciho postupnosti chcete zistit:");
        int n = vstup.nextInt();

        GeneratorFibonaccihoPostupnosti generator = new GeneratorFibonaccihoPostupnosti(n);
        long nTeCislo = generator.dalsieCislo();

        System.out.println(n + ". cislo vo Fibonacciho postupnosti je cislo: " + nTeCislo);
    }
}
