package javazaklady.Zadanie_5_3_3;

import java.util.Scanner;

public class GeneratorFibonaccihoPostupnostiTester {
    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);
        System.out.print("1.) Zadaj cislo: ");
        int cislo = vstup.nextInt();
        GeneratorFibonaccihoPostupnosti fibonacihoPostuposti = new GeneratorFibonaccihoPostupnosti(cislo);
        System.out.print(fibonacihoPostuposti.dalsieCislo());
    }
}

