package fronta;

import java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_2.fronta.Kategoria;
import java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_2.fronta.Zakaznik;

public class Poziadavka
{
    private final Zakaznik zakaznik;
    private final Kategoria kategoria;

    public Poziadavka(final Zakaznik zakaznik, final Kategoria kategoria)
    {
        this.zakaznik = zakaznik;
        this.kategoria = kategoria;
    }

    public Zakaznik getZakaznik()
    {
        return zakaznik;
    }

    public Kategoria getKategoria()
    {
        return kategoria;
    }

    @Override
    public String toString()
    {
        return "Poziadavka[" +
                "zakaznik=" + zakaznik +
                ", kategoria=" + kategoria +
                ']';
    }
}
