package javazaklady.lecture9.activity2.Zadanie_9_2_3.part2;

public class DvojrozmernyGrafickyUtvar
{
    private double sirka;
    private double vyska;

    public DvojrozmernyGrafickyUtvar(double sirka, double vyska)
    {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public double getSirka()
    {
        return sirka;
    }

    public double getVyska()
    {
        return vyska;
    }

    void zobrazRozmer()
    {
        System.out.println("sirka = " + sirka + ", vyska = " + vyska);
    }
}
