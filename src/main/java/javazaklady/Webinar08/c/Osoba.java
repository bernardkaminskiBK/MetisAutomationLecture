package javazaklady.Webinar08.c;

public class Osoba
{
    private String meno;
    private double vyska;

    public Osoba(String meno, double vyska)
    {
        this.meno = meno;
        this.vyska = vyska;
    }

    public String getMeno()
    {
        return meno;
    }

    public double getVyska()
    {
        return vyska;
    }
}
