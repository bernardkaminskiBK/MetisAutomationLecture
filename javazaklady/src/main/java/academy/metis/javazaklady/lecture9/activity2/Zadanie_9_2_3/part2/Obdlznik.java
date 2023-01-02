package academy.metis.javazaklady.lecture9.activity2.Zadanie_9_2_3.part2;

public class Obdlznik extends DvojrozmernyGrafickyUtvar
{
    public Obdlznik(double sirka, double vyska)
    {
        super(sirka, vyska);
    }

    boolean jeStvorec()
    {
        // museli sme nahradit sirka a vyska getterom, lebo sa neviem dostat napriamo
        // k private instancnym premennym (tie maju byt private)
        return getSirka() == getVyska();
        /*
        if (sirka == vyska)
        {
            return true;
        }
        else
        {
            return false;
        }*/
    }

    public double plocha()
    {
        return getSirka() * getVyska();
    }
}
