package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;


public class HelpDestTest {

    @Test
    void helpTest()
    {
        System.setOut(new StorePrintStream(System.out));
        HelpDesk.main(new String[0]);
        Assertions.assertTrue(StorePrintStream.printList.get(0).startsWith("Pista"));
    }

//    @ParameterizedTest
//    @CsvSource(value = {"Karol"})
//    void getZakaznik(String expectedResult)
//    {
//        Poziadavka zakaznik = new Poziadavka(Zakaznik.KAROL, Kategoria.TLACIAREN);
//        Assertions.assertEquals(expectedResult, Zakaznik.KAROL.getClass().getName());
//
//    }

//    @Test
//    void zaevidujPoziadavkuTest()
//    {
//        Poziadavka poziadavka = new Poziadavka(new Zakaznik("Katka"),Kategoria.TLACIAREN);
//        Assertions.assertEquals("Katka", poziadavka.getZakaznik().);
//    }

}
