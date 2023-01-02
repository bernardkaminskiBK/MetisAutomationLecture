package academy.metis.javazaklady.lecture16.activity2.Zadanie_16_2_1;

public class Vyrobok
{
    private String nazov;
    private double cena;
    private double vaha;

    public Vyrobok(String nazov, double vaha)
    {
        this.nazov = nazov;
        this.vaha = vaha;
    }

    public Vyrobok(String nazov, double cena, double vaha)
    {
        this.nazov = nazov;
        this.cena = cena;
        this.vaha = vaha;
    }

    public String getNazov()
    {
        return nazov;
    }

    public double getCena()
    {
        return cena;
    }

    public double getVaha()
    {
        return vaha;
    }

    @Override
    public String toString()
    {
        return "Vyrobok{" + "nazov='" + nazov + '\'' + ", cena=" + cena + ", vaha=" + vaha + '}';
    }
}
