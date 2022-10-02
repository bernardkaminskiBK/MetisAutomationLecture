package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3;

public class Trojuholnik extends DvojrozmernyGrafickyUtvar
{
    String styl;

    public Trojuholnik()
    {
        //System.out.println("... zavolal sa konstruktor: Trojuholnik()");
    }

    public Trojuholnik(double sirka, double vyska) {
        super();
    }

    void zobrazStyl()
    {
        System.out.println("styl: " + styl);
    }

    double plocha()
    {
        return sirka * vyska / 2;
    }
}
