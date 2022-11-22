package java_spolocna_praca_s_lektorom.webinar15.Zadanie_15_2_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ZretazenyZoznamTest {

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
        osoby.zmazZoZaciatku();
        assertNotEquals("Peter", osoby.getPrvy());
    }
}
