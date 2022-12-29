package javazaklady.lecture19.activity2.Zadanie_19_2_1.part1;

import javazaklady.lecture19.activity2.Zadanie_19_2_1.part1.Kategoria;
import javazaklady.lecture19.activity2.Zadanie_19_2_1.part1.KategorizovanyHelpDesk;
import javazaklady.lecture19.activity2.Zadanie_19_2_1.part1.Poziadavka;
import javazaklady.lecture19.activity2.Zadanie_19_2_1.part1.Zakaznik;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;
import java.util.ArrayDeque;
import java.util.Queue;


import  static org.assertj.core.api.Assertions.*;

public class KategorizovanyHelpDeskTest {


    @Test
    void Test()
    {
        System.setOut(new StorePrintStream(System.out));
        KategorizovanyHelpDesk.main(new String[0]);
        Assertions.assertTrue(StorePrintStream.printList.get(0).contains("Nemam co robit, netyka sa ma to."));
    }

    @Test
    void zaevidujPoziadavkuTest()
    {
        Zakaznik martin = new Zakaznik("Martin");
        Zakaznik barbora = new Zakaznik("Barborka");
        Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        poziadavky.add(new Poziadavka(martin, Kategoria.POCITAC));
        poziadavky.add(new Poziadavka(barbora, Kategoria.TELEFON));
        assertThat(poziadavky).isNotEmpty();
    }

    @Test
    void spracujPoziadavkuTlaciarenTest()
    {
        Zakaznik karol = Zakaznik.KAROL;
        Kategoria tlaciaren = Kategoria.TLACIAREN;
        Poziadavka poziadavka = new Poziadavka(karol,tlaciaren);
        assertThat(poziadavka.getKategoria()).isEqualTo(Kategoria.TLACIAREN);
    }

    @Test
    void spracujVseobecnuPoziadavkuTest()
    {
        Zakaznik karol = Zakaznik.KAROL;
        Kategoria tlaciaren = Kategoria.TELEFON;
        Poziadavka poziadavka = new Poziadavka(karol,tlaciaren);
        assertThat(poziadavka.getKategoria()).isNotEqualTo(Kategoria.TLACIAREN);
    }

    @Test
    void spracujPoziadavkuTest2()
    {
        Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        Zakaznik karol = Zakaznik.KAROL;
        Kategoria tlaciaren = Kategoria.TLACIAREN;
        poziadavky.add(new Poziadavka(karol,tlaciaren));
        assertThat(poziadavky).isNotEmpty();
        poziadavky.remove();
        assertThat(poziadavky).isEmpty();

    }

    @Test
    void spracujPoziadavkuTest()
    {
        Queue<Poziadavka> poziadavky = new ArrayDeque<>();
        Zakaznik karol = Zakaznik.KAROL;
        Kategoria tlaciaren = Kategoria.TLACIAREN;
        poziadavky.add(new Poziadavka(karol,tlaciaren));
        assertThat(poziadavky).isNotEmpty();
        poziadavky.poll();
        assertThat(poziadavky).isEmpty();

    }

}
