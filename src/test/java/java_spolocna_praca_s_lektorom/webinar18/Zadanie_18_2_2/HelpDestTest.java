package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;
import java.util.ArrayDeque;
import java.util.Queue;
import static org.assertj.core.api.Assertions.*;



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

    @Test
    void spracujPoziadavkuTest()
    {
        final Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        poziadavky.add(new Poziadavka(Zakaznik.KATKA,Kategoria.TLACIAREN));
        poziadavky.add(new Poziadavka(Zakaznik.KAROL,Kategoria.POCITAC));
        poziadavky.remove();
        poziadavky.remove();
        assertThat(poziadavky).isEmpty();
    }
}
