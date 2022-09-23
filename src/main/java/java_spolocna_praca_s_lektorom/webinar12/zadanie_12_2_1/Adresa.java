package java_spolocna_praca_s_lektorom.webinar12.zadanie_12_2_1;

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
