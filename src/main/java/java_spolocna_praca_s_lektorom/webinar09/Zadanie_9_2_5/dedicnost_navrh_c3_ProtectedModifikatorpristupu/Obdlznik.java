package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_5.dedicnost_navrh_c3_ProtectedModifikatorpristupu;

public class Obdlznik extends DvojrozmernyGrafickyUtvar
{
    public Obdlznik(double sirka, double vyska)
    {
        super(sirka, vyska);
    }

    boolean jeStvorec()
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

    double plocha()
    {
        return sirka * vyska;
    }
}
