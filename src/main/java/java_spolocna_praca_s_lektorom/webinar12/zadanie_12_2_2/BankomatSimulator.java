package java_spolocna_praca_s_lektorom.webinar12.zadanie_12_2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BankomatSimulator
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);
        Bankomat bankomat = null;

        final String SUBOR_S_KLIENTAMI = "\\klienti1.txt";

        try {
            Banka banka = new Banka();
            String s = new File("").getParentFile().getPath();
            System.out.println(s);
            banka.nacitajKlientov(s + SUBOR_S_KLIENTAMI);
            bankomat = new Bankomat(banka);
        }
        catch (FileNotFoundException vynimka)
        {
            System.out.println("Chyba pri nacitani suboru: '" + SUBOR_S_KLIENTAMI + "'");
            System.exit(0);     // return
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true)
        {
            int stav = bankomat.getStav();

            if (stav == Bankomat.START)
            {
                System.out.print("Zadaj klientske cislo: ");
                int klientskeCislo = vstup.nextInt();
                bankomat.nastavKlientskeCislo(klientskeCislo);
            }
            else if (stav == Bankomat.PIN)
            {
                System.out.print("Zadaj PIN: ");
                int pin = vstup.nextInt();
                bankomat.nastavKlienta(pin);
            }
            else if (stav == Bankomat.UCET)
            {
                System.out.print("A = Bezny ucet, B = Sporiaci ucet, C = Koniec: ");
                String volba = vstup.next();

                if (volba.equalsIgnoreCase("a"))
                {
                    bankomat.nastavTypUctu(Bankomat.BEZNY);
                }
                else if (volba.equalsIgnoreCase("b"))
                {
                    bankomat.nastavTypUctu(Bankomat.SPORIACI);
                }
                else if (volba.equalsIgnoreCase("c"))
                {
                    bankomat.reset();
                }
                else
                {
                    System.out.print("Nespravna volba!");
                }
            }
            else if (stav == Bankomat.TRANSAKCIA)
            {
                System.out.println("Aktualny zostatok na ucte:  " + bankomat.getAktualnyZostatok() + " Eur");

                System.out.print("A = Vklad, B = Vyber, C = Krok spat: ");

                String volba = vstup.next();

                if (volba.equalsIgnoreCase("a"))
                {
                    System.out.print("Ciastka: ");
                    double ciastka = vstup.nextDouble();

                    bankomat.vloz(ciastka);
                    bankomat.nastavPredchadzajuciStav();
                }
                else if (volba.equalsIgnoreCase("b"))
                {
                    System.out.print("Ciastka:");
                    double ciastka = vstup.nextDouble();

                    bankomat.vyber(ciastka);
                    bankomat.nastavPredchadzajuciStav();
                }
                else if (volba.equalsIgnoreCase("c"))
                {
                    bankomat.nastavPredchadzajuciStav();
                }
                else
                {
                    System.out.println("Nespravna volba!");
                }
            }
        }
    }
}
