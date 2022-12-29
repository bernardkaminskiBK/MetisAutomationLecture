package javazaklady.lecture6.activity2.Zadanie_6_2_1;

public class BankovyUcet {
    private int cisloUctu;
    private double aktualnyZostatok;

    public BankovyUcet(int cisloUctu, double aktualnyZostatok) {
        this.cisloUctu = cisloUctu;
        this.aktualnyZostatok = aktualnyZostatok;
    }

    public int getCisloUctu() {
        return cisloUctu;
    }

    public void vloz(double ciastka)
    {
        this.aktualnyZostatok += ciastka;
    }

    public void vyber(double ciastka)
    {
        this.aktualnyZostatok -= ciastka;
    }

    public double getAktualnyZostatok() {
        return aktualnyZostatok;
    }
}
