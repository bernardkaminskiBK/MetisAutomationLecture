package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_4.dedicnost_navrh_c2_PrivateModifikatorPristupu;

public class Trojuholnik extends DvojrozmernyGrafickyUtvar
{
    String styl;

    public Trojuholnik(double sirka, double vyska)
    {
        super(sirka, vyska);
        // System.out.println("... zavolal sa konstruktor: Trojuholnik()");
    }

    void zobrazStyl()
    {
        System.out.println("styl: " + styl);
    }

    double plocha()
    {
        return getSirka() * getVyska() / 2;
    }
}
