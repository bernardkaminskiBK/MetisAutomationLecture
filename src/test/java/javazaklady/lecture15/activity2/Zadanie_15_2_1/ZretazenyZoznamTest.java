package javazaklady.lecture15.activity2.Zadanie_15_2_1;

import javazaklady.lecture15.activity2.Zadanie_15_2_1.ZoznamIterator;
import javazaklady.lecture15.activity2.Zadanie_15_2_1.ZretazenyZoznam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class ZretazenyZoznamTest {

    ZretazenyZoznam studenti = new ZretazenyZoznam();


    @Test
    void pridajNaZaciatokTest()
    {
        ZretazenyZoznam osoby = new ZretazenyZoznam();
        osoby.pridajNaZaciatok("Martin");
        osoby.pridajNaZaciatok("Peter");
        assertEquals("Peter", osoby.getPrvy());
    }

    @Test
    void zmazZoZaciatkuTest()
    {
        ZretazenyZoznam osoby = new ZretazenyZoznam();
        osoby.pridajNaZaciatok("Martin");
        osoby.pridajNaZaciatok("Peter");
        System.out.println(osoby);
        osoby.zmazZoZaciatku();
        assertNotEquals("Peter", osoby.getPrvy());
    }

    @Test
    void iteratorPridajTest()
    {
        ZoznamIterator iterator = studenti.iteratorZoznam();
        iterator.pridaj("Milan");
        iterator.pridaj("Martin");
        assertThat(studenti.getPrvy()).isEqualTo("Milan");
    }

    @Test
    void iteratorZmazTest()
    {
        ZoznamIterator iterator = studenti.iteratorZoznam();
        iterator.pridaj("Milan");
        iterator.pridaj("Martin");
        assertThat(studenti.zmazZoZaciatku()).isEqualTo("Milan");

    }

}

