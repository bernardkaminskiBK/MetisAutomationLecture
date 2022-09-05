package javazaklady.Zadanie_9_3_2;

public class SporiaciUcet extends BankovyUcet
{
    private double urokovaSadzba;
    private double urok;

    public SporiaciUcet(double urokovaSadzba)
    {
        this.urokovaSadzba = urokovaSadzba;
    }

    public void vlozNaUcet(double suma, BankovyUcet typUctu)
    {
        typUctu.vloz(suma);
        this.vyber(suma);
    }

    public void zapisUrok()
    {
        urok = urokovaSadzba * super.getMinZostatok() / 100;
        super.vloz(urok);
    }
}
