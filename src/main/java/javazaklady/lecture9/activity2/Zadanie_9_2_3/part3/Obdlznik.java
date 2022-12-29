package javazaklady.lecture9.activity2.Zadanie_9_2_3.part3;

public class Obdlznik extends DvojrozmernyGrafickyUtvar
{
    public Obdlznik(double sirka, double vyska)
    {
        super(sirka, vyska);
    }

    public boolean jeStvorec()
    {
        // ak sme si zadali, ze instancne premenne budu mat modifikator pristupu Protected,
        // odstranime getter metody a musime oproti prikladu 2 znova zmenit getSirka() a
        // getVyska() na obycajne sirka a vyska.
        return sirka == vyska;
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
        return sirka * vyska;
    }
}
