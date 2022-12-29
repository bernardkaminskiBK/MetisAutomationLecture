package javazaklady.lecture12.activity2.Zadanie_12_2_2;

public class Klient
{
    private final int ID;
    private final int pin;
    private BankovyUcet beznyUcet;
    private BankovyUcet sporiaciUcet;

    public Klient(int klientskeCislo, int pin)
    {
        this.ID = klientskeCislo;
        this.pin = pin;
        beznyUcet = new BankovyUcet();
        sporiaciUcet = new BankovyUcet();
    }

    public boolean jeTotoznyS(int klientskeCislo, int pin)
    {
        return this.ID == klientskeCislo && this.pin == pin;
    }

    public BankovyUcet getBeznyUcet()
    {
        return beznyUcet;
    }

    public BankovyUcet getSporiaciUcet()
    {
        return sporiaciUcet;
    }
}
