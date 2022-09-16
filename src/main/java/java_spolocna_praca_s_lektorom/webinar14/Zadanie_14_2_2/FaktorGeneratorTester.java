package java_spolocna_praca_s_lektorom.webinar14.Zadanie_14_2_2;

import java.util.Scanner;

public class FaktorGeneratorTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadajte cislo na rozklad: ");

        int cislo = vstup.nextInt();

        FaktorGenerator generator = new FaktorGenerator(cislo);

        System.out.println("Vypis delitelov cisla " + cislo + ":");

        while (generator.existujeDalsiFaktor())
        {
            System.out.println(generator.dalsiFaktor());
        }
    }
}
