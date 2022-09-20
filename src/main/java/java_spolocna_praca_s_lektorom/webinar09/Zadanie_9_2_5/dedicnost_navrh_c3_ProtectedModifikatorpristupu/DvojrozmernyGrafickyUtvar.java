package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_5.dedicnost_navrh_c3_ProtectedModifikatorpristupu;

public class DvojrozmernyGrafickyUtvar
{
    protected double sirka;
    protected double vyska;

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
