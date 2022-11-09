package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;


public class HelpDestTest {

    @Test
    void helpTest()
    {
        System.setOut(new StorePrintStream(System.out));
        HelpDesk.main(new String[0]);
        Assertions.assertTrue(StorePrintStream.printList.get(0).startsWith("Pista"));
    }

    @Test
    void zaevidujPoziadavkuTest()
    {
        Zakaznik katka = new Zakaznik("Katka");
        Kategoria tlaciaren = Kategoria.TLACIAREN;

        Poziadavka poziadavka = new Poziadavka(katka,tlaciaren);
        poziadavka.getZakaznik().posliSpravu("ahoj");

        Assertions.assertEquals(katka, poziadavka.getZakaznik());
    }

}
