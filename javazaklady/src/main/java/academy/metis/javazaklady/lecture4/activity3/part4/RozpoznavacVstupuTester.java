package academy.metis.javazaklady.lecture4.activity3.part4;

import java.util.Scanner;

public class RozpoznavacVstupuTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zelate si pokracovat dalej?");

        String vstupPouzivatela = vstup.nextLine();

        RozpoznavacVstupu rozpoznavac = new RozpoznavacVstupu(vstupPouzivatela);

        if (rozpoznavac.jeToKladnaOdpoved())
        {
            System.out.println("OK");
        }
        else if (rozpoznavac.jeToZapornaOdpoved())
        {
            System.out.println("Ukoncujem pracu s programom . . .");
        }
        else
        {
            System.out.println("Nespravny vstup");
        }
    }
}
