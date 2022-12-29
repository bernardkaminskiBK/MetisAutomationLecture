package javazaklady2.Webinar09.part4;

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
