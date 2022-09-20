package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_4.dedicnost_navrh_c2_PrivateModifikatorPristupu;

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

    double plocha()
    {
        return getSirka() * getVyska();
    }
}
