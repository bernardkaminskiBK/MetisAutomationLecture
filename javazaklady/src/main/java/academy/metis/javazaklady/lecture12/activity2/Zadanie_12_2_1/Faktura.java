package academy.metis.javazaklady.lecture12.activity2.Zadanie_12_2_1;

import java.util.ArrayList;
import java.util.List;

public class Faktura
{
    private final Adresa adresa;
    private List<Polozka> polozky;

    public Faktura(Adresa adresa)
    {
        this.adresa = adresa;
        polozky = new ArrayList<>();
    }

    public void pridaj(Produkt produkt, int mnozstvo)
    {
        Polozka polozka = new Polozka(produkt, mnozstvo);
        polozky.add(polozka);
    }

    public String naformatuj()
    {
        String vystup = "           FAKTURA\n";
        vystup += adresa.naformatuj() + "\n\n";
        vystup += String.format("%-30s%14s%14s%14s\n", "Popis", "Cena", "Mnozstvo", "Celkova cena");

        for (Polozka polozka : polozky)
        {
            vystup += polozka.naformatuj();
        }

        vystup += String.format("\nCelkova suma na uhradu: %8.2f Eur%n", getCelkovaSumaNaUhradu());

        return vystup;
    }

    private double getCelkovaSumaNaUhradu()
    {
        double celkovaSuma = 0;

        for (Polozka polozka : polozky)
        {
            celkovaSuma += polozka.getCelkovaCena();
        }

        return celkovaSuma;
    }
}
