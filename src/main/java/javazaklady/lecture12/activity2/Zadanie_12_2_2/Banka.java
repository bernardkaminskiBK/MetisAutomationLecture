package javazaklady.lecture12.activity2.Zadanie_12_2_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Banka
{
    private ArrayList<Klient> klienti;

    public Banka()
    {
        klienti = new ArrayList<>();
    }
    public void nacitajKlientov(String datovySubor) throws FileNotFoundException
    {
        Scanner vstupZoSuboru = new Scanner(new FileReader(datovySubor));

        while (vstupZoSuboru.hasNext())
        {
            int klientskeCislo = vstupZoSuboru.nextInt();
            int pin = vstupZoSuboru.nextInt();
            Klient klient = new Klient(klientskeCislo, pin);
            klienti.add(klient);
        }
    }

    public void pridajKlienta(Klient klient)
    {
        klienti.add(klient);
    }

    public Klient vyhladajKlienta(int klientskeCislo, int pin)
    {
        for (Klient klient : klienti)
        {
            if (klient.jeTotoznyS(klientskeCislo, pin))
            {
                return klient;
            }
        }
        return null;
    }
}
