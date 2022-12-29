package javazaklady.lecture12.activity2.Zadanie_12_2_1;

public class Polozka
{
    private final Produkt produkt;
    private final int mnozstvo;

    public Polozka(Produkt produkt, int mnozstvo)
    {
        this.produkt = produkt;
        this.mnozstvo = mnozstvo;
    }

    public String naformatuj()
    {
        return String.format("%-30s%14.2f%14d%14.2f%n", produkt.getNazov(), produkt.getCena(), mnozstvo, getCelkovaCena());
    }

    public double getCelkovaCena()
    {
        return produkt.getCena() * mnozstvo;
    }
}
