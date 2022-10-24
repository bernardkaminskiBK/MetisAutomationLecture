package javazaklady.Webinar07.c;

public class Minca
{
    public String nazovMince;
    public double hodnotaMince;

    public Minca(String nazovMince, double hodnotaMince)
    {
        this.nazovMince = nazovMince;
        this.hodnotaMince = hodnotaMince;
    }

    public double getHodnotaMince()
    {
        return hodnotaMince;
    }

    public String getNazovMince()
    {
        return nazovMince;
    }
}
