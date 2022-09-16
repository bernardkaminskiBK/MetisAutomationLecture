package java_spolocna_praca_s_lektorom.webinar01.grafika.webinar06.banka;

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
