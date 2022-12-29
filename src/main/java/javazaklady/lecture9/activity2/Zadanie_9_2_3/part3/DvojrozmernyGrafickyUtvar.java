package javazaklady.lecture9.activity2.Zadanie_9_2_3.part3;

public class DvojrozmernyGrafickyUtvar
{
    public double sirka;
    public double vyska;

    public DvojrozmernyGrafickyUtvar(double sirka, double vyska)
    {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    void zobrazRozmer()
    {
        System.out.println("sirka = " + sirka + ", vyska = " + vyska);
    }
}
