package javazaklady.lecture16.activity2.Zadanie_16_2_2;

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
        return "Vyrobok{" +
                "nazov='" + nazov + '\'' +
                ", cena=" + cena +
                ", vaha=" + vaha +
                '}';
    }

    // metoda vygenerovana cez alt + insert -> equals and hash code
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Vyrobok)) return false;

        Vyrobok vyrobok = (Vyrobok) o;

        if (Double.compare(vyrobok.cena, cena) != 0) return false;
        if (Double.compare(vyrobok.vaha, vaha) != 0) return false;
        return nazov != null ? nazov.equals(vyrobok.nazov) : vyrobok.nazov == null;
    }
}
