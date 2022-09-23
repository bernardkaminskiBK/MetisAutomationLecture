package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_1.mnoziny;

import org.junit.jupiter.api.Test;

import static java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_1.mnoziny.Sklad.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class ProduktovyKatalogTest
{
    @Test
    public void testUnikatnychPrvkovVProduktovomKatalogu()
    {
        ProduktovyKatalog katalog = new ProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog, containsInAnyOrder(dlazobnaKocka, dvere, okno));
    }

    @Test
    public void testUnikatnychPrvkovVZotriedenomProduktovomKatalogu()
    {
        mnoziny.ZotriedenyProduktovyKatalog katalog = new mnoziny.ZotriedenyProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog, containsInAnyOrder(dlazobnaKocka, dvere, okno));
    }

    @Test
    public void testLahkychVyrobkov()
    {
        mnoziny.ZotriedenyProduktovyKatalog katalog = new mnoziny.ZotriedenyProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog.getLahkeVyrobky(), containsInAnyOrder(okno));
    }

    @Test
    public void testTazkychVyrobkov()
    {
        mnoziny.ZotriedenyProduktovyKatalog katalog = new mnoziny.ZotriedenyProduktovyKatalog();

        katalog.pridajVyrobkyOd(fero);
        katalog.pridajVyrobkyOd(karol);

        assertThat(katalog.getTazkeVyrobky(), containsInAnyOrder(dlazobnaKocka, dvere));
    }
}
