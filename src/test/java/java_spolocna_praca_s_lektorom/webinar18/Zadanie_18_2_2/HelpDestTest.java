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

    @Test
    void zaevidujPoziadavkuTest()
    {
        Zakaznik katka = new Zakaznik("Katka");
        Kategoria tlaciaren = Kategoria.TLACIAREN;

        Poziadavka poziadavka = new Poziadavka(katka,tlaciaren);
        poziadavka.getZakaznik().posliSpravu("ahoj");

        System.out.println(poziadavka);
        poziadavka.getKategoria().toString();
        System.out.println( poziadavka.getKategoria().toString());

        Assertions.assertEquals("Katka", poziadavka.getZakaznik());
    }

}
