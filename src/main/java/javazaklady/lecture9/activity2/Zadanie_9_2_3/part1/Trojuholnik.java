package javazaklady.lecture9.activity2.Zadanie_9_2_3.part1;

public class Trojuholnik extends DvojrozmernyGrafickyUtvar
{
    public String styl;

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

    public double plocha()
    {
        return sirka * vyska / 2;
    }
}
