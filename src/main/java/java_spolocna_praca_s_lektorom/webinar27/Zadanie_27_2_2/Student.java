package java_spolocna_praca_s_lektorom.webinar27.Zadanie_27_2_2;

public class Student
{
    private String meno;
    private String priezvisko;
    private double priemerZnamok;

    public Student(String meno, String priezvisko, double priemerZnamok)
    {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.priemerZnamok = priemerZnamok;

    }

    public String getMeno()
    {
        return meno;
    }

    public String getPriezvisko()
    {
        return priezvisko;
    }

    public double getPriemerZnamok()
    {
        return priemerZnamok;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", priemerZnamok=" + priemerZnamok +
                '}';
    }
}
