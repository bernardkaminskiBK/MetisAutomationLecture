package javazaklady.lecture7.activity2.Zadanie_7_2_2;

public class ImmutableStudent
{
    private int vek;
    private String meno;
    private double priemerZnamok;

    public ImmutableStudent(int vek, String meno, double priemerZnamok)
    {
        this.vek = vek;
        this.meno = meno;
        this.priemerZnamok = priemerZnamok;
    }

    // Immutable class nema ziadne settre, neda sa upravovat (nemozno modifikovat stav objektov), Settre:
    public int getVek()
    {
        return vek;
    }

    public String getMeno()
    {
        return meno;
    }

    public double getPriemerZnamok()
    {
        return priemerZnamok;
    }
}
