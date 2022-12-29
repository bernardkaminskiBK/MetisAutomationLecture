package javazaklady.lecture12.activity2.Zadanie_12_2_1;

public class Produkt {
    private final String nazov;
    private final double cena;

    public Produkt(String nazov, double cena)
    {
        this.nazov = nazov;
        this.cena = cena;
    }

    public double getCena()
    {
        return cena;
    }

    public String getNazov()
    {
        return nazov;
    }
}
