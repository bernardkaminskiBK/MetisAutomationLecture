package javazaklady.Zadanie_3_3_4;

import java.util.Scanner;

public class DvojicaTester
{
    public static void main(String[] args)
    {
        System.out.println("Zadajte dvojicu cisel: ");
        Scanner vstup = new Scanner(System.in);

        double cislo1 = vstup.nextDouble();
        double cislo2 = vstup.nextDouble();

        Dvojica dvojica = new Dvojica(cislo1, cislo2);

        System.out.println("Sucet cisel " + cislo1 + " a " + cislo2 + " je " + dvojica.getSucet());
        System.out.println("Rozdiel cisel " + cislo1 + " a " + cislo2 + " je " + dvojica.getRozdiel());
        System.out.println("Sucin cisel " + cislo1 + " a " + cislo2 + " je " + dvojica.getSucin());
        System.out.println("Priemer cisel " + cislo1 + " a " + cislo2 + " je " + dvojica.getPriemer());
        System.out.println("Vzdialenost medzi cislami " + cislo1 + " a " + cislo2 + " je " + dvojica.getVzdialenost());
        System.out.println("Maximom z dvojice je cislo " + dvojica.getMaximum());
        System.out.println("Minimom z dvojice je cislo " + dvojica.getMinimum());
    }
}

