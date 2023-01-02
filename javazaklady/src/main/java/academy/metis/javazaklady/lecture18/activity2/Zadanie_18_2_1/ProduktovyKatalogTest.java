package academy.metis.javazaklady.lecture18.activity2.Zadanie_18_2_1;

import org.junit.jupiter.api.Test;

import static academy.metis.javazaklady.lecture18.activity2.Zadanie_18_2_1.Sklad.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class ProduktovyKatalogTest {

    @Test
    public void testUnikatnychPrvkovVProduktovomKatalogu() {
        ProduktovyKatalog katalog = new ProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog, containsInAnyOrder(dlazobnaKocka, dvere, okno));
    }

    @Test
    public void testUnikatnychPrvkovVZotriedenomProduktovomKatalogu() {
        ZotriedenyProduktovyKatalog katalog = new ZotriedenyProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog, contains(okno, dlazobnaKocka, dvere));
    }

    @Test
    public void testLahkychVyrobkov() {
        ZotriedenyProduktovyKatalog katalog = new ZotriedenyProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog.getLahkeVyrobky(), containsInAnyOrder(okno));
    }

    @Test
    public void testTazkychVyrobkov() {
        ZotriedenyProduktovyKatalog katalog = new ZotriedenyProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog.getTazkeVyrobky(), containsInAnyOrder(dlazobnaKocka, dvere));
    }

}
