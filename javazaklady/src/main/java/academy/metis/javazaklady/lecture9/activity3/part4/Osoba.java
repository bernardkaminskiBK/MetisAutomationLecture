package academy.metis.javazaklady.lecture9.activity3.part4;

public class Osoba {
    private String meno;
    private int rokNarodenia;

    public Osoba(String meno, int rokNarodenia)
    {
        this.meno = meno;
        this.rokNarodenia = rokNarodenia;
    }

    public String toString()
    {
        return "Osoba: " + meno + ", roknarodenia = " + rokNarodenia;
    }
}
