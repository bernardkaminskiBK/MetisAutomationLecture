package javazaklady.Webinar09.Zadanie_9_3_4;

public class Instruktor extends Osoba {
    private double plat;

    public Instruktor(String meno, int rokNarodenia, double plat)
    {
        super(meno, rokNarodenia);
        this.plat = plat;
    }


    public String toString()
    {
        return "Zamestnanec = " + super.toString() + ", plat = " + plat;
    }
}
