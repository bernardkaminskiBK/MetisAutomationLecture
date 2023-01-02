package academy.metis.javazaklady.lecture12.activity2.Zadanie_12_2_1;

public class Adresa
{
    private final String nazov;
    private final String ulica;
    private final String psc;
    private final String mesto;

    public Adresa(String nazov, String ulica, String psc, String mesto)
    {
        this.nazov = nazov;
        this.ulica = ulica;
        this.psc = psc;
        this.mesto = mesto;
    }

    public String naformatuj()
    {
        return nazov + "\n" + ulica + "\n" + psc + " " + mesto;
    }
}
