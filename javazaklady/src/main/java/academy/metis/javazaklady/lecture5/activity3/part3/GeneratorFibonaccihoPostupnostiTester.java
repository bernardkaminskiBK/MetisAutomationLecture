package academy.metis.javazaklady.lecture5.activity3.part3;

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
