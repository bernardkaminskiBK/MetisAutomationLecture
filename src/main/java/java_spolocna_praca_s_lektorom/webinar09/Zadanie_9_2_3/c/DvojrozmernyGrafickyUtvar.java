package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3.c;

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
