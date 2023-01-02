package academy.metis.javazaklady.lecture22.activity2.Zadanie_22_2_5;

public class Hrac
{
    private String meno, priezvisko;
    private int pocetGolov;

    public Hrac(String meno, String priezvisko, int pocetGolov)
    {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pocetGolov = pocetGolov;
    }

    public String getMeno()
    {
        return meno;
    }

    public String getPriezvisko()
    {
        return priezvisko;
    }

    public int getPocetGolov()
    {
        return pocetGolov;
    }

    @Override
    public String toString()
    {
        return "Hrac{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pocetGolov=" + pocetGolov +
                '}';
    }
}
