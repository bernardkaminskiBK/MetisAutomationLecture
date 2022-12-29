package javazaklady2.Webinar08.part2;

public class Kviz
{
    public double precenta;
    public String znamka;

    public Kviz(double precenta, String znamka)
    {
        this.precenta = precenta;
        this.znamka = znamka;
    }

    public double getPrecenta() {
        return precenta;
    }

    public String getZnamka() {
        return znamka;
    }
}
