package academy.metis.javazaklady.lecture18.activity2.Zadanie_18_2_1;

import java.util.*;

/**
 * Produktovy katalog bude obsahovat unikatne vyrobky, t.j. nesmie obsahovat duplicity.
 */
public class ZotriedenyProduktovyKatalog implements Iterable<Vyrobok> {
    private static final double MEDZNA_VAHA_VYROBKOV = 20.0;
    private SortedSet<Vyrobok> vyrobky = new TreeSet<>(Vyrobok.PODLA_VAHY);

    public void pridajVyrobkyOd(Dodavatel dodavatel) {
        vyrobky.addAll(dodavatel.getVyrobky());
    }

    @Override
    public Iterator<Vyrobok> iterator() {
        return vyrobky.iterator();
    }

    public SortedSet<Vyrobok> getLahkeVyrobky() {
        Vyrobok najlahsiZTazkychVyrobkov = vyhladajNajlahsiZTazkychVyrobkov();
        return vyrobky.headSet(najlahsiZTazkychVyrobkov);
    }

    public SortedSet<Vyrobok> getTazkeVyrobky() {
        Vyrobok najlahsiZTazkychVyrobkov = vyhladajNajlahsiZTazkychVyrobkov();
        return vyrobky.tailSet(najlahsiZTazkychVyrobkov);
    }

    private Vyrobok vyhladajNajlahsiZTazkychVyrobkov() {
        for (Vyrobok vyrobok : vyrobky) {
            if (vyrobok.getVaha() > MEDZNA_VAHA_VYROBKOV) {
                return vyrobok;
            }
        }

        return vyrobky.last();
    }
}
