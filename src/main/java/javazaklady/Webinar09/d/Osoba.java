package javazaklady.Webinar09.d;

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
