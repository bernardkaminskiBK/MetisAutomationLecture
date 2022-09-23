package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_1.mnoziny;

import java.util.ArrayList;
import java.util.List;

public class Dodavatel
{
    private String nazov;
    private final List<Vyrobok> vyrobky = new ArrayList<>(); // final sluzi nie na zamknutie mnoztva vyrobkov v liste, ale zamkne odkaz na list

    public Dodavatel(String nazov)
    {
        this.nazov = nazov;
    }

    public String getNazov()
    {
        return nazov;
    }

    public List<Vyrobok> getVyrobky()
    {
        return vyrobky;
    }

    @Override
    public String toString()
    {
        return "Dodavatel[" +
                "nazov='" + nazov + '\'' +
                ", vyrobky=" + vyrobky +
                ']';
    }
}