package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3.a;

public class Obdlznik extends DvojrozmernyGrafickyUtvar
{
    public boolean jeStvorec()
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

    public double plocha()
    {
        return sirka * vyska;
    }
}
