package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3;

public class Obdlznik extends DvojrozmernyGrafickyUtvar
{
    boolean jeStvorec()
    {
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
