package academy.metis.javazaklady.lecture9.activity3.part4;

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
