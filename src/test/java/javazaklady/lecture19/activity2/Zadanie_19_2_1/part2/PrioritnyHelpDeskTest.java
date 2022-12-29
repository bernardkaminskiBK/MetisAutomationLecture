package javazaklady.lecture19.activity2.Zadanie_19_2_1.part2;

import javazaklady.lecture19.activity2.Zadanie_19_2_1.part2.Kategoria;
import javazaklady.lecture19.activity2.Zadanie_19_2_1.part2.Poziadavka;
import javazaklady.lecture19.activity2.Zadanie_19_2_1.part2.Zakaznik;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


import java.util.ArrayDeque;
import java.util.Queue;

public class PrioritnyHelpDeskTest {

    @Test
    void zaevidujPoziadavkuTest()
    {
        Zakaznik peter = new Zakaznik("Peter");
        Zakaznik aneta = new Zakaznik("Aneta");
        Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        poziadavky.add(new Poziadavka(peter, Kategoria.POCITAC));
        poziadavky.add(new Poziadavka(aneta, Kategoria.TLACIAREN));
        assertThat(poziadavky).isNotEmpty();
    }

    @Test
    void spracujVsetkyPoziadavky2Test()
    {
        Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        Zakaznik karol = Zakaznik.KAROL;
        Kategoria telefon = Kategoria.TELEFON;
        poziadavky.add(new Poziadavka(karol,telefon));
        assertThat(poziadavky).isNotEmpty();
        poziadavky.remove();
        assertThat(poziadavky).isEmpty();
    }

    @Test
    void spracujVsetkyPoziadavky()
    {
        Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        Zakaznik karol = Zakaznik.KAROL;
        Kategoria telefon = Kategoria.TELEFON;
        poziadavky.add(new Poziadavka(karol,telefon));
        assertThat(poziadavky).isNotEmpty();
        poziadavky.poll();
        assertThat(poziadavky).isEmpty();

    }


}
