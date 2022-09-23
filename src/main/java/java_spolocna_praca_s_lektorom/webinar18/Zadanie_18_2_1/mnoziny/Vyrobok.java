package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_1.mnoziny;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Vyrobok
{
    // Vytvor komparator pomocou odkazu na metodu (Method reference, operator ::)
    public static final Comparator<Vyrobok> PODLA_NAZVU = comparing(Vyrobok::getNazov);
    public static final Comparator<Vyrobok> PODLA_VAHY = comparing(Vyrobok::getVaha);

    private String nazov;
    private double vaha;

    public Vyrobok(String nazov, double vaha)
    {
        this.nazov = nazov;
        this.vaha = vaha;
    }

    public String getNazov()
    {
        return nazov;
    }

    public double getVaha()
    {
        return vaha;
    }

    @Override
    public String toString()
    {
        return "Vyrobok[" +
                "nazov='" + nazov + '\'' +
                ", vaha=" + vaha +
                ']';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Vyrobok)) return false;

        Vyrobok vyrobok = (Vyrobok) o;

        if (Double.compare(vyrobok.vaha, vaha) != 0) return false;
        return nazov != null ? nazov.equals(vyrobok.nazov) : vyrobok.nazov == null;
    }

    @Override
    public int hashCode()
    {
        int result;
        long temp;
        result = nazov != null ? nazov.hashCode() : 0;
        temp = Double.doubleToLongBits(vaha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
