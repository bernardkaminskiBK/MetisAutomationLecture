package java_spolocna_praca_s_lektorom.webinar15.Zadanie_15_2_1;

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

}

