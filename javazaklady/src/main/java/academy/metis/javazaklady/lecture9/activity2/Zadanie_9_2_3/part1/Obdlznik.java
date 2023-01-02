package academy.metis.javazaklady.lecture9.activity2.Zadanie_9_2_3.part1;

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
