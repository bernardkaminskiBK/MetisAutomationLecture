package javazaklady.lecture18.activity2.Zadanie_18_2_2;

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
