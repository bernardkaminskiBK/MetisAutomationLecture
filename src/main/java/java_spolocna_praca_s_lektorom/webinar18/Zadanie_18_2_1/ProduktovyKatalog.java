package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Produktovy katalog bude obsahovat unikatne vyrobky, t.j. nesmie obsahovat duplicity.
 */
public class ProduktovyKatalog implements Iterable<Vyrobok> {
    private Set<Vyrobok> vyrobky = new HashSet<>(); // HashSet = mnozina objektov v unikatnom stave

    public void pridajVyrobkyOd(Dodavatel dodavatel) {
        vyrobky.addAll(dodavatel.getVyrobky()); // naprike tomu, ze sme tam dali list, budu v produktovom katalogu len unikatne vyrobky, je to funkcionalita Javy, ked pouzijeme List do Set
    }

    @Override
    public Iterator<Vyrobok> iterator() {
        return vyrobky.iterator();
    }
}
