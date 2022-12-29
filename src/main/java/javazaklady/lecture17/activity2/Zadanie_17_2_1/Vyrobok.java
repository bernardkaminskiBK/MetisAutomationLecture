package javazaklady.lecture17.activity2.Zadanie_17_2_1;

import java.util.Comparator;
import java.util.Objects;

public class Vyrobok
{
    // implementacia komparatora ako anonymna trieda
    public static final Comparator<Vyrobok> PODLA_VAHY = new Comparator<Vyrobok>()
    {
        @Override
        public int compare(Vyrobok v1, Vyrobok v2)
        {
            if (v1.getVaha() < v2.getVaha())
            {
                return -1;
            }
            else if (v1.getVaha() > v2.getVaha())
            {
                return 1;
            }
            return 0;
        }
    };

    private String nazov;
    private double cena;
    private double vaha;

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
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Vyrobok)) return false;

        Vyrobok vyrobok = (Vyrobok) o;

        if (Double.compare(vyrobok.cena, cena) != 0) return false;
        if (Double.compare(vyrobok.vaha, vaha) != 0) return false;
        return Objects.equals(nazov, vyrobok.nazov);
    }

    @Override
    public int hashCode()
    {
        int result;
        long temp;
        result = nazov != null ? nazov.hashCode() : 0;
        temp = Double.doubleToLongBits(cena);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(vaha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString()
    {
        return "Vyrobok[" +
                "nazov='" + nazov + '\'' +
                ", cena=" + cena +
                ", vaha=" + vaha +
                ']';
    }
}
