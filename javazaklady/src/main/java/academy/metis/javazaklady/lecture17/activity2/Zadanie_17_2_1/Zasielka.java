package academy.metis.javazaklady.lecture17.activity2.Zadanie_17_2_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zasielka implements Iterable<Vyrobok>
{
    private static final int MAX_VAHA_LAHKE_VYROBKY = 20;
    private static final int NEEXISTUJUCI_VYROBOK = -1;
    private List<Vyrobok> vyrobky = new ArrayList<>();
    private List<Vyrobok> lahkeVyrobky;
    private List<Vyrobok> tazkeVyrobky;

    public void pridaj(Vyrobok vyrobok)
    {
        vyrobky.add(vyrobok);
    }

    public void nahrad(Vyrobok povodny, Vyrobok novy)
    {
        int pozicia = vyrobky.indexOf(povodny);

        if (pozicia != NEEXISTUJUCI_VYROBOK)
        {
            vyrobky.set(pozicia, novy);
        }
    }

    public void priprav()
    {
        vyrobky.sort(Vyrobok.PODLA_VAHY);
        // Collections.sort(vyrobky, Vyrobok.PODLA_VAHY);

        int indexZlomu = vyhladajIndexHranicnehoVyroku();

        lahkeVyrobky = vyrobky.subList(0, indexZlomu);
        tazkeVyrobky = vyrobky.subList(indexZlomu, vyrobky.size());
    }

    private int vyhladajIndexHranicnehoVyroku()
    {
        for (int i = 0; i < vyrobky.size(); i++)
        {
            Vyrobok vyrobok = vyrobky.get(i);

            if (vyrobok.getVaha() > MAX_VAHA_LAHKE_VYROBKY)
            {
                return i;
            }
        }
        return 0;
    }

    public List<Vyrobok> getLahkeVyrobky()
    {
        return lahkeVyrobky;
    }

    public List<Vyrobok> getTazkeVyrobky()
    {
        return tazkeVyrobky;
    }

    @Override
    public Iterator<Vyrobok> iterator()
    {
        return vyrobky.iterator();
    }
}
