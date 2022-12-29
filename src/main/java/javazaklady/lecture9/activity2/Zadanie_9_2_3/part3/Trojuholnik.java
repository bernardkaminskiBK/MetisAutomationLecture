package javazaklady.lecture9.activity2.Zadanie_9_2_3.part3;

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
        return sirka * vyska / 2;
    }
}
