package java_spolocna_praca_s_lektorom.webinar19.Zadanie_19_2_1.b;

import java_spolocna_praca_s_lektorom.webinar19.zadanie_19_2_1.b.Kategoria;
import java_spolocna_praca_s_lektorom.webinar19.zadanie_19_2_1.b.Poziadavka;
import java_spolocna_praca_s_lektorom.webinar19.zadanie_19_2_1.b.Zakaznik;
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


}
