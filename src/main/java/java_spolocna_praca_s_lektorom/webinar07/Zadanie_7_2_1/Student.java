package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_1;

public class Student
{
    private int vek;
    private String meno;
    private double priemerZnamok;

    public Student(int vek, String meno, double priemerZnamok)
    {
        this.vek = vek;
        this.meno = meno;
        this.priemerZnamok = priemerZnamok;
    }

    // Gettre a Settre
    public int getVek()
    {
        return vek;
    }

    public void setVek(int vek)
    {
        this.vek = vek;
    }

    public String getMeno()
    {
        return meno;
    }

    public void setMeno(String meno)
    {
        this.meno = meno;
    }

    public double getPriemerZnamok()
    {
        return priemerZnamok;
    }

    public void setPriemerZnamok(double priemerZnamok)
    {
        this.priemerZnamok = priemerZnamok;
    }
}
