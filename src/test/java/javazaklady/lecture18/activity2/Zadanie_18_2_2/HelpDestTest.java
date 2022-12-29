package javazaklady.lecture18.activity2.Zadanie_18_2_2;

import javazaklady.lecture18.activity2.Zadanie_18_2_2.HelpDesk;
import javazaklady.lecture18.activity2.Zadanie_18_2_2.Kategoria;
import javazaklady.lecture18.activity2.Zadanie_18_2_2.Poziadavka;
import javazaklady.lecture18.activity2.Zadanie_18_2_2.Zakaznik;
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
        final Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        poziadavky.add(new Poziadavka(Zakaznik.KATKA, Kategoria.TLACIAREN));
        poziadavky.add(new Poziadavka(Zakaznik.KAROL,Kategoria.POCITAC));
        assertThat(poziadavky).isNotEmpty();
    }

    @Test
    void overZakaznikaTets()
    {
        Zakaznik juraj = new Zakaznik("Juraj");
        Kategoria kategoria = Kategoria.POCITAC;
        Poziadavka poziadavka = new Poziadavka(juraj, kategoria);
        Assertions.assertEquals(juraj, poziadavka.getZakaznik());
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